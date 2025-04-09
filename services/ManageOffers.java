package services;
import java.util.Scanner;
import com.mypackage.Order;
import enums.OrderStatus;
import repositories.OrderService;

public class ManageOffers {
    static Scanner input = new Scanner(System.in);

    public static void displayOrders(){
        int orderCount = OrderService.fetchSize();
        
        System.out.println("");
        System.out.println("::::Available Orders::::");
        System.out.println("");

        for (int i = 0; i < orderCount; i++) {
            Order order = OrderService.fetchSingleOrder(i+1);
            if (order.orderStatus == OrderStatus.PENDING) {
                System.out.println("Order "+order.orderId + " || Pickup: "+ order.pickup + " || Destination: "+ order.destination + " || Fare:  £" + order.fare);
                System.out.println("");

            };
        }
    };

    public static void acceptOrder(int driverId, int orderId){
        int orderCount = OrderService.fetchSize();
        for (int i = 0; i < orderCount; i++) {
            Order order = OrderService.fetchSingleOrder(i+1);
            if (order.orderId == orderId) {
                order.driverId = driverId;
                order.orderStatus = OrderStatus.ACTIVATED;
                System.out.println("Order Accepted... "+ "Pick up the customer at " + order.pickup);
            }
        };
    };
};
