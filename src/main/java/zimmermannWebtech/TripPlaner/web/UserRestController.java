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
        user.add(new User(1,"David","Zimmermann","male","DavidZ","test"));
        user.add(new User(2,"Nina","Zimmermann","female","NinaZ","test"));
        user.add(new User(3,"Dariusz","Haratyk","male", "DarekH","test"));
    }

    @GetMapping(path = "/entity/v1/user")
    public ResponseEntity<List<User>> showUser(){
        return ResponseEntity.ok(user);
    }
}
