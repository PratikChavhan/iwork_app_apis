package com.demo.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@NotEmpty
	private String phone;
	
	@Email(message = "Email address is not valid !!")
	private String email;
	
	@NotEmpty
	private String password;
	
	@NotNull
	private String country;
	
	@NotEmpty
	private String city;
}
