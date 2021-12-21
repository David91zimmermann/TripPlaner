package zimmermannWebtech.TripPlaner.Service;

import org.springframework.stereotype.Service;
import zimmermannWebtech.TripPlaner.persistence.UserEntity;
import zimmermannWebtech.TripPlaner.persistence.UserRepo;
import zimmermannWebtech.TripPlaner.web.entity.User;
import zimmermannWebtech.TripPlaner.web.entity.UserManipulationRequest;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepo userRepo;
    private final UserTransformer userTransformer;

    public UserService(UserRepo userRepo, UserTransformer userTransformer) {
        this.userRepo = userRepo;
        this.userTransformer = userTransformer;
    }

    public List<User> findAll() {
        List<UserEntity> users = userRepo.findAll();
        return users.stream()
                .map(userTransformer::transformEntity)
                .collect(Collectors.toList());
    }

    public User findById(Long id) {
        var userEntity = userRepo.findById(id);
        return userEntity.map(userTransformer::transformEntity).orElse(null);
    }

    public User create(UserManipulationRequest request) {
        var userEntity = new UserEntity(request.getUsername(), request.getPassword(), request.getFirstName(), request.getLastName());
        userEntity = userRepo.save(userEntity);
        return userTransformer.transformEntity(userEntity);
    }

    public User update(Long id, UserManipulationRequest request) {
        var userEntityOptional = userRepo.findById(id);
        if (userEntityOptional.isEmpty()) {
            return null;
        }

        var userEntity = userEntityOptional.get();
        userEntity.setUsername(request.getUsername());
        userEntity.setPassword(request.getPassword());
        userEntity.setFirstName(request.getFirstName());
        userEntity.setLastName(request.getLastName());
        userEntity = userRepo.save(userEntity);

        return userTransformer.transformEntity(userEntity);
    }

    public boolean deleteById(Long id) {
        if (!userRepo.existsById(id)) {
            return false;
        }

        userRepo.deleteById(id);
        return true;
    }
}
