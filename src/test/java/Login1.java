import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login1 {
    @Parameters({"url","username","password"})
    @Test
    public void login(String url, String username, String password){
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }
    @Test
    public void logout(){
        System.out.println("logged out");
    }
}
