package repositories;
import java.util.ArrayList;
import com.mypackage.Driver;

public class DriverService {
    static ArrayList<Driver> drivers = new ArrayList<Driver>();

    public static Object fetchDrivers(){
        return drivers;
    };

    public static int fetchSize(){
        return drivers.size();
    }

    public static void addDriver(Driver newDriver){
        drivers.add(newDriver);
    };
};