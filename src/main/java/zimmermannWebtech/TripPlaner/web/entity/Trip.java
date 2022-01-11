package zimmermannWebtech.TripPlaner.web.entity;

import java.util.List;

public class Trip {

    private long id;
    private String urlaubsname;
    private String reiseort;
    private String tripbegin;
    private String tripend;

    public Trip(long id, String urlaubsname, String reiseort, String tripbegin, String tripend) {
        this.id = id;
        this.urlaubsname = urlaubsname;
        this.reiseort = reiseort;
        this.tripbegin = tripbegin;
        this.tripend = tripend;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
