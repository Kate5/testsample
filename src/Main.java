import com.backendless.Backendless;
        import com.backendless.BackendlessUser;

/**
 * Created by kate on 2/4/16.
 */
public class Main {

    public static void main(String[] args) {

        Backendless.initApp( "8C315A16-8AB3-FCF8-FF95-5F00E1357600", "27C57A9C-6EBE-1080-FF26-FEC8BEBDA700", "v1" );
        Backendless.setUrl( "http://localhost:9000" );

        String email = "foo@foo.com";
        String password = "1";

        BackendlessUser backendlessUser = new BackendlessUser();
        backendlessUser.setEmail(email);
        backendlessUser.setPassword(password);
        BackendlessUser register = Backendless.UserService.register(backendlessUser);
       // register.setPassword( password );
        User user = new User();
        user.setEmail(email);
        user.setUsers( register );

        Backendless.Persistence.save(user);


    }
}
