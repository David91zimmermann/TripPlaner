package zimmermannWebtech.TripPlaner.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zimmermannWebtech.TripPlaner.web.entity.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserRestController {

    private List<User> user;

    public UserRestController(){
        this.user = new ArrayList();
        user.add(new User("DavidZ","test", "David","Zimmermann"));
        user.add(new User("NinaZ","test", "Nina","Zimmermann"));
        user.add(new User("DarekH","test", "Dariusz","Haratyk"));
    }

    @GetMapping(path = "/entity/v1/users")
    public ResponseEntity<List<User>> showUser(){
        return ResponseEntity.ok(user);
    }
}
