import com.mypackage.User;
import services.RegisterUser;
import services.RegisterVehicle;

public class TaxiService {
    public static void main(String[] args) {
        User newUser = RegisterUser.main();
        System.out.println(newUser.accountType);
        switch (newUser.accountType) {
            case CUSTOMER:
                
                break;
                case DRIVER:
                RegisterVehicle.main(newUser.id);
                break;
        
            default:
                break;
        }
    };
};