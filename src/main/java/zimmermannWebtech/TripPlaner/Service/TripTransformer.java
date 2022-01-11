package zimmermannWebtech.TripPlaner.Service;

import org.springframework.stereotype.Service;
import zimmermannWebtech.TripPlaner.persistence.TripEntity;
import zimmermannWebtech.TripPlaner.web.entity.Trip;

@Service
public class TripTransformer {
    public Trip transformEntity(TripEntity tripEntity) {
        return new Trip(
                tripEntity.getId(),
                tripEntity.getUrlaubsname(),
                tripEntity.getReiseort(),
                tripEntity.getReisestart(),
                tripEntity.getReiseende(),
                tripEntity.getErsteller(),
                tripEntity.getBegleiter(),
                tripEntity.getAnfragende());
    }
}
