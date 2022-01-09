package zimmermannWebtech.TripPlaner.web.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Trip {

    private long tid;
    private String urlaubsname;
    private String reiseort;
    private LocalDateTime reisestart;
    private LocalDateTime reiseende;
    private String ersteller;
    private List<String> begleiter;
    private List<String> anfragende;

    public Trip(long tid, String urlaubsname, String reiseort, LocalDateTime reisestart, LocalDateTime reiseende, String ersteller, List<String> begleiter, List<String> anfragende) {
        this.tid = tid;
        this.urlaubsname = urlaubsname;
        this.reiseort = reiseort;
        this.reisestart = reisestart;
        this.reiseende = reiseende;
        this.ersteller = ersteller;
        this.begleiter = begleiter;
        this.anfragende = anfragende;
    }

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
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

    public LocalDateTime getReisestart() {
        return reisestart;
    }

    public void setReisestart(LocalDateTime reisestart) {
        this.reisestart = reisestart;
    }

    public LocalDateTime getReiseende() {
        return reiseende;
    }

    public void setReiseende(LocalDateTime reiseende) {
        this.reiseende = reiseende;
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
