package utilities;

import java.time.LocalDate;

import com.mypackage.Driver;
import com.mypackage.Order;
import com.mypackage.User;

import enums.AccountType;
import enums.DriverStatus;
import enums.OrderStatus;
import repositories.DriverService;
import repositories.OrderService;
import repositories.UserService;

public class InitializeRecords {
    

    public static void generateUsers(){
        // Existing Users
            UserService.addUser(new User(1, "john doe", "male", "johndoe@email.com", LocalDate.now(), "+448079895590", "+2347551111632", "DY4 9EF", AccountType.CUSTOMER));
            UserService.addUser(new User(2, "michale sam", "male", "michale@email.com", LocalDate.now(), "+448078885590", "+2347552321632", "DI5 9OG", AccountType.CUSTOMER));
            UserService.addUser(new User(3, "cardi bella", "female", "cardibella@email.com", LocalDate.now(), "+448079896643", "+234755984332", "J32 9FG", AccountType.CUSTOMER));
            UserService.addUser(new User(4, "magnus anuns", "male", "magnus@email.com", LocalDate.now(), "+2218079895590", "+137551111632", "DO4 J3E", AccountType.DRIVER));
            UserService.addUser(new User(5, "maryanne jeep", "female", "maryannejeep@email.com", LocalDate.now(), "+2883983776", "+3239251103632", "ER4 7JK", AccountType.DRIVER));
            UserService.addUser(new User(6, "josh mattew", "male", "johnmatt@email.com", LocalDate.now(), "+442764356220", "+223376782123", "FE4 K92", AccountType.DRIVER));
        // Existing Driver Records
            DriverService.addDriver(new Driver(1, 4, "mercedes", "c63 amg", "JWT101E", DriverStatus.ACTIVE));
            DriverService.addDriver(new Driver(2, 5, "ford", "mustang", "EU594J", DriverStatus.BOOKED));
            DriverService.addDriver(new Driver(3, 6, "bugatti", "tourbilion", "UAE-01", DriverStatus.OFFLINE));

    }

    public static void generateOrders(){
        OrderService.createOrder(new Order(1, 1, "71 Trafalgar square", "Birmingham City University, City Center", 20, OrderStatus.PENDING, 0));
        OrderService.createOrder(new Order(2, 3, "11 Joseph Hall", "Doug Ellis Sports Center", 40, OrderStatus.PENDING, 0));
        OrderService.createOrder(new Order(3, 2, "Perry Hall Park", "Aston Villa Football Stadium", 7, OrderStatus.ACTIVATED, 2));       
        OrderService.createOrder(new Order(4, 3, "25 Josephine Rd", "Think Tank, Millenium Point", 15, OrderStatus.COMPLETED, 1));
    }
}
