package zimmermannWebtech.TripPlaner.Service;

import org.springframework.stereotype.Service;
import zimmermannWebtech.TripPlaner.persistence.TripEntity;
import zimmermannWebtech.TripPlaner.persistence.TripRepo;
import zimmermannWebtech.TripPlaner.web.entity.Trip;
import zimmermannWebtech.TripPlaner.web.entity.TripManipulationRequest;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TripService {

    private final TripRepo tripRepo;
    private final TripTransformer tripTransformer;

    public TripService(TripRepo tripRepo, TripTransformer tripTransformer) {
        this.tripRepo = tripRepo;
        this.tripTransformer = tripTransformer;
    }

    public List<Trip> findAll() {
        List<TripEntity> trips = tripRepo.findAll();
        return trips.stream()
                .map(tripTransformer::transformEntity)
                .collect(Collectors.toList());
    }

    public Trip findById(Long tid) {
        var tripEntity = tripRepo.findById(tid);
        return tripEntity.map(tripTransformer::transformEntity).orElse(null);
    }

    public Trip create(TripManipulationRequest request) {
        var tripEntity = new TripEntity(request.getUrlaubsname(), request.getReiseort(), request.getReisestart(), request.getReiseende(), request.getErsteller(), request.getBegleiter(), request.getAnfragende());
        tripEntity = tripRepo.save(tripEntity);
        return tripTransformer.transformEntity(tripEntity);
    }

    public Trip update(Long tid, TripManipulationRequest request) {
        var tripEntityOptional = tripRepo.findById(tid);
        if (tripEntityOptional.isEmpty()) {
            return null;
        }

        var tripEntity = tripEntityOptional.get();
        tripEntity.setUrlaubsname(request.getUrlaubsname());
        tripEntity.setReiseort(request.getReiseort());
        tripEntity.setReisestart(request.getReisestart());
        tripEntity.setReiseende(request.getReiseende());
        tripEntity = tripRepo.save(tripEntity);

        return tripTransformer.transformEntity(tripEntity);
    }

    public boolean deleteById(Long tid) {
        if (!tripRepo.existsById(tid)) {
            return false;
        }

        tripRepo.deleteById(tid);
        return true;
    }
}

