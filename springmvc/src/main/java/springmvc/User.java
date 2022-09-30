package springmvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
	private String username, email;

	@NotBlank(message = "Username is required!")
	@Size(min=6, max=8, message = "Username must be 6-8 chars")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@NotBlank(message = "Email is required!")
	@Email(message = "Not a valid email!")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
