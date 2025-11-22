import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {
    @GetMapping("/sample")
    public user getSampleUser() {
        user use = new user();
        user.setId(1);
        user.setUsername("testuser");
        user.setAddress("123 Main Street");
        user.setPhone("1234567890");
        user.setPassword("password");
        return use;
    }
}



