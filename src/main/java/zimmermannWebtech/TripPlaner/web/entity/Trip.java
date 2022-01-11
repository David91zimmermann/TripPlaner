package zimmermannWebtech.TripPlaner.web.entity;

import java.util.List;

public class Trip {

    private long tid;
    private String urlaubsname;
    private String reiseort;
    private String reisestart;
    private String reiseende;
    private String ersteller;
    private List<String> begleiter;
    private List<String> anfragende;

    public Trip(long tid, String urlaubsname, String reiseort, String reisestart, String reiseende, String ersteller, List<String> begleiter, List<String> anfragende) {
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

    public String getReisestart() {
        return reisestart;
    }

    public void setReisestart(String reisestart) {
        this.reisestart = reisestart;
    }

    public String getReiseende() {
        return reiseende;
    }

    public void setReiseende(String reiseende) {
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
