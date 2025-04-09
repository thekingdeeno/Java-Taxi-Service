import java.util.Scanner;
import com.mypackage.User;

import services.BookRide;
import services.ManageOffers;
import services.RegisterUser;
import services.RegisterVehicle;
import utilities.InitializeRecords;

public class TaxiService {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Launching Deeno Ride... Initializing Envronment...");
        InitializeRecords.generateUsers();
        InitializeRecords.generateOrders();

        User newUser = RegisterUser.main();

        System.out.println(newUser.accountType);
        switch (newUser.accountType) {
            case CUSTOMER:
                BookRide.initiate(newUser.id);
                break;
                case DRIVER:
                    int newDriverId = RegisterVehicle.main(newUser.id).employeeid;
                    ManageOffers.displayOrders();
                    System.out.print("Please select an order to accept (Choose an order number eg 1, 2 etc)");
                    int selectedOrder = Integer.parseInt(input.nextLine());
                    ManageOffers.acceptOrder(newDriverId, selectedOrder);
                break;
        
            default:
                break;
        };

        System.out.println("Thanks for using Deeno Ride...");
    };
};