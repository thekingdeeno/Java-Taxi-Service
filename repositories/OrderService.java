package repositories;
import java.util.ArrayList;
import com.mypackage.Order;

public class OrderService {
    static ArrayList<Order> orders = new ArrayList<Order>();

    public static Object fetchOrders(){
        return orders;
    };

public static Order fetchSingleOrder(int orderId){
        return orders.get(orderId -1);
    }

    public static int fetchSize(){
        return orders.size();
    }

    public static void createOrder(Order newOrder){
        orders.add(newOrder);
    };
};
