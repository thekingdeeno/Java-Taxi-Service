package services;
import java.util.Scanner;

import com.mypackage.Order;

import enums.OrderStatus;
import repositories.OrderService;


public class BookRide {
    static Scanner input = new Scanner(System.in);

    public static void initiate(int userId) {

        String pickup;
        String destination;
        int fare;

        System.out.println("Where do you want to go to?");
        destination = input.nextLine();

        System.out.println("Where do you want the driver to pick you from?");
        pickup = input.nextLine();

        fare = (int)(Math.random() * 101);
        System.out.println("Calculating ride fare, please wait...");

        
        System.out.println("The price is £"+fare+". Do you want to proceed? (yes/no)");

        if ((input.nextLine()).equals("yes")) {
            Order order = new Order(OrderService.fetchSize() + 1, userId, pickup, destination, fare, OrderStatus.PENDING, 0);
            OrderService.createOrder(order);
            System.out.println("Order booked successfully🚀");
            System.out.println("Your order will be accepted and your driver will be with you shortly ...have a nice day!!!");

        }else{
            System.out.println("Alright then... Bye!👋🏼");
        }

    }
}
