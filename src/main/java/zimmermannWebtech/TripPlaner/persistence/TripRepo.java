package zimmermannWebtech.TripPlaner.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripRepo extends JpaRepository<TripEntity, Long> {

    List<TripEntity> findAllByUrlaubsname(String urlaubsname);

}
