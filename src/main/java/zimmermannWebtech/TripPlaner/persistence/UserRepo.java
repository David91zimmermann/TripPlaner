package zimmermannWebtech.TripPlaner.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zimmermannWebtech.TripPlaner.web.entity.User;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findAllByUsername(String username);

}
