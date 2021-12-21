package zimmermannWebtech.TripPlaner.Service;

import org.springframework.stereotype.Service;
import zimmermannWebtech.TripPlaner.persistence.UserEntity;
import zimmermannWebtech.TripPlaner.web.entity.User;

@Service
public class UserTransformer {

    public User transformEntity(UserEntity userEntity) {
        return new User(
                userEntity.getId(),
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getFirstName(),
                userEntity.getLastName());
    }
}
