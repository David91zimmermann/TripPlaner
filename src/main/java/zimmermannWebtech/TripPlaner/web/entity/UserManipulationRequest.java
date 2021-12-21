package zimmermannWebtech.TripPlaner.web.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
public class UserManipulationRequest {

    @NotBlank(message = "The last name must not be empty.")
    private String firstName;

    @NotBlank(message = "The last name must not be empty.")
    private String lastName;

    @NotBlank(message = "The username must not be empty.")
    private String username;

    @Size(min = 3, message = "Please provide a password with 3 characters or more.")
    private String password;

    public UserManipulationRequest() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
