package repositories;
import java.util.ArrayList;
import com.mypackage.User;

public class UserService {
    static ArrayList<User> users = new ArrayList<User>();

    public static Object fetchUsers(){
        return users;
    };

    public static int fetchSize(){
        return users.size();
    }

    public static void addUser(User newUser){
        users.add(newUser);
    };

    public static void deleteUser(int userId){
        System.out.println(users.size());
        users.remove(userId - 1);
        System.out.println(users.size());
    };
};