package com.farmermanagementdemo1.registration;

import lombok.*;

import javax.validation.constraints.*;

import com.farmermanagementdemo1.validation.ValidPassword;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[^0-9]*", message = "Must not contain numbers")
    private  String name;

    @NotEmpty
    @NotNull
    @Size(min = 10, max = 12)
    @Digits(fraction = 0, integer = 12)
    private  String contactNumber;

    @NotNull
    @NotEmpty
    @Email
    private  String email;

    @NotEmpty
    @ValidPassword
    private  String password;

    @NotNull
    @Size(min = 5, max = 50)
    private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
