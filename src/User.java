import com.backendless.BackendlessUser;

/**
 * Created by kate on 2/4/16.
 */
public class User {

    private String email;
    private BackendlessUser users;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BackendlessUser getUsers() {
        return users;
    }

    public void setUsers(BackendlessUser users) {
        this.users = users;
    }

    //  public String password;

}
