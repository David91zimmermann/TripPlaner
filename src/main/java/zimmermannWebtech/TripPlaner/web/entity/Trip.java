package zimmermannWebtech.TripPlaner.web.entity;

import java.util.List;

public class Trip {

    private long id;
    private String urlaubsname;
    private String reiseort;
    private String tripbegin;
    private String tripend;
    private String ersteller;
    private List<String> begleiter;
    private List<String> anfragende;

    public Trip(long id, String urlaubsname, String reiseort, String tripbegin, String tripend, String ersteller, List<String> begleiter, List<String> anfragende) {
        this.id = id;
        this.urlaubsname = urlaubsname;
        this.reiseort = reiseort;
        this.tripbegin = tripbegin;
        this.tripend = tripend;
        this.ersteller = ersteller;
        this.begleiter = begleiter;
        this.anfragende = anfragende;
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

    public String getErsteller() {
        return ersteller;
    }

    public void setErsteller(String ersteller) {
        this.ersteller = ersteller;
    }

    public List<String> getBegleiter() {
        return begleiter;
    }

    public void setBegleiter(List<String> begleiter) {
        this.begleiter = begleiter;
    }

    public List<String> getAnfragende() {
        return anfragende;
    }

    public void setAnfragende(List<String> anfragende) {
        this.anfragende = anfragende;
    }
}
