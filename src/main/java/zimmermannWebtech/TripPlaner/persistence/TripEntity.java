package zimmermannWebtech.TripPlaner.persistence;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "trips")
public class TripEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "urlaubsname", nullable = false)
    private String urlaubsname;

    @Column(name = "reiseort", nullable = false)
    private String reiseort;

    @Column(name = "tripbegin", nullable = false)
    private String tripbegin;

    @Column(name = "tripend", nullable = false)
    private String tripend;

    protected TripEntity() {}

    public TripEntity(String urlaubsname, String reiseort, String tripbegin, String tripend) {
        this.urlaubsname = urlaubsname;
        this.reiseort = reiseort;
        this.tripbegin = tripbegin;
        this.tripend = tripend;
    }

    public Long getId() {
        return id;
    }

    public String getUrlaubsname() {
        return urlaubsname;
    }

    public void setUrlaubsname(String urlaubsname) {
        this.urlaubsname = urlaubsname;
    }

    public String getReiseort() {
        return reiseort;
    }

    public void setReiseort(String reiseort) {
        this.reiseort = reiseort;
    }

    public String getTripbegin() {
        return tripbegin;
    }

    public void setTripbegin(String tripbegin) {
        this.tripbegin = tripbegin;
    }

    public String getTripend() {
        return tripend;
    }

    public void setTripend(String tripend) {
        this.tripend = tripend;
    }
}
