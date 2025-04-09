package services;
import java.time.LocalDate;
import java.util.Scanner;
import com.mypackage.User;
import enums.AccountType;
import repositories.UserService;

public class RegisterUser {
    static Scanner input = new Scanner(System.in);
    // public static char[] main;
    public static User main() {

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

        String fullName;
        String gender;
        String email;
        String homeTelNo;
        String mobileTelNo;
        String address;
        LocalDate regDate = LocalDate.now();

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

        int currSize = UserService.fetchSize();

        User newUser = new User(currSize + 1, fullName, gender, email, regDate, homeTelNo, mobileTelNo, address, accountType);

        UserService.addUser(newUser);
        
        return newUser;

    }
}