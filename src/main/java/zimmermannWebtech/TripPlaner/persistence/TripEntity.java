package zimmermannWebtech.TripPlaner.persistence;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "trips")
public class TripEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tid")
    private Long tid;

    @Column(name = "urlaubsname", nullable = false)
    private String urlaubsname;

    @Column(name = "reiseort", nullable = false)
    private String reiseort;

    @Column(name = "reisestart", nullable = false)
    private LocalDateTime reisestart;

    @Column(name = "reiseende", nullable = false)
    private LocalDateTime reiseende;

    @Column(name = "ersteller")
    private String ersteller;

    @ElementCollection
    @Column(name = "begleiter")
    private List<String> begleiter;

    @ElementCollection
    @Column(name = "anfragende")
    private List<String> anfragende;

    protected TripEntity() {}

    public TripEntity(String urlaubsname, String reiseort, LocalDateTime reisestart, LocalDateTime reiseende, String ersteller, List<String> begleiter, List<String> anfragende) {
        this.urlaubsname = urlaubsname;
        this.reiseort = reiseort;
        this.reisestart = reisestart;
        this.reiseende = reiseende;
        this.ersteller = ersteller;
        this.begleiter = begleiter;
        this.anfragende = anfragende;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
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
