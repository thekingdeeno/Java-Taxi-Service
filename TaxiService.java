import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import com.mypackage.AccountType;
import com.mypackage.User;


public class TaxiService {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();

        System.out.println(users.size());
        
        System.out.println("Welcome to Deeno Ride!");
        System.out.println("Please choose profile (enter 'customer' or 'driver')");

        AccountType accountType = null;

         String selectedProfile = input.nextLine();

         switch (selectedProfile) {
            case "customer":
            accountType = AccountType.CUSTOMER;
                break;
                case "driver":
                accountType = AccountType.DRIVER;
                break;
         
            default:
            System.out.println("ERROR::===> Invalid account type selected");
            System.out.println("Please restart the process and choose a valid profile type");
                break;
         }

        if (accountType != null) {
            System.out.println(accountType);  
        };

        
        String fullName;
        String gender;
        String email;
        LocalDate regDate = LocalDate.now();
        String homeTelNo;
        String mobileTelNo;
        String address;

        System.out.println("What is your legal full name?");
        fullName = input.nextLine();
        System.out.println("What is your email address?");
        email = input.nextLine();
        System.out.println("Specify your gender at birth");
        gender = input.nextLine();
        System.out.println("Enter your home telephone number?");
        homeTelNo = input.nextLine();
        System.out.println("Enter your mobile number?");
        mobileTelNo = input.nextLine();
        System.out.println("Please type in your full address");
        address = input.nextLine();

        User newUser = new User(0, fullName, gender, email, regDate, homeTelNo, mobileTelNo, address);

        users.add(newUser);
        System.out.println(users.size());
        System.out.println(newUser);

    }
}