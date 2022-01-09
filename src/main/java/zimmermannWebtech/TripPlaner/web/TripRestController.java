package zimmermannWebtech.TripPlaner.web;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import zimmermannWebtech.TripPlaner.Service.TripService;
import zimmermannWebtech.TripPlaner.web.entity.Trip;
import zimmermannWebtech.TripPlaner.web.entity.TripManipulationRequest;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@Validated
public class TripRestController {

    private final TripService tripService;

    public TripRestController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping(path = "/api/v1/trips")
    public ResponseEntity<List<Trip>> fetchTrips() {
        return ResponseEntity.ok(tripService.findAll());
    }

    @GetMapping(path = "/api/v1/trips/{tid}")
    public ResponseEntity<Trip> fetchTripsById(@PathVariable Long tid) {
        var trip = tripService.findById(tid);
        return trip != null? ResponseEntity.ok(trip) : ResponseEntity.notFound().build();
    }

    @PostMapping(path = "/api/v1/trips")
    public ResponseEntity<Void> createTrip(@Valid @RequestBody TripManipulationRequest request) throws URISyntaxException {
        var trip = tripService.create(request);
        URI uri = new URI("/api/v1/trips/" + trip.getTid());
        return ResponseEntity
                .created(uri)
                .header("Access-Control-Expose-Headers", "Location")
                .build();
    }

    @PutMapping(path = "/api/v1/trips/{tid}")
    public ResponseEntity<Trip> updateTrip(@PathVariable Long tid, @RequestBody TripManipulationRequest request) {
        var trip = tripService.update(tid, request);
        return trip != null? ResponseEntity.ok(trip) : ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/api/v1/trips/{tid}")
    public ResponseEntity<Void> deleteTrip(@PathVariable Long tid) {
        boolean successful = tripService.deleteById(tid);
        return successful? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
