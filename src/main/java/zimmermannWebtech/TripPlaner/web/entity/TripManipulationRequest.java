package zimmermannWebtech.TripPlaner.web.entity;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class TripManipulationRequest {

    @NotBlank(message = "Der Urlaubsname darf nicht leer sein.")
    private String urlaubsname;

    @NotBlank(message = "Bitte geben Sie einen Reiseort an.")
    private String reiseort;

    @NotBlank(message = "Bitte geben Sie das Startdatum Ihrer Reise an.")
    private String tripbegin;

    @NotBlank(message = "Bitte geben Sie das Rückkehrdatum Ihrer Reise an.")
    private String tripend;

    public TripManipulationRequest() {}

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

}
