package com.lib.controller.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UpdateRequestDTO {

	@NotNull(message = "First name can not be null")
    @NotBlank(message = "First name can not be white space")
    @Size(min = 2,max = 25,message = "First name '${validatedValue}' must be between {min} and {max} long")
	private String firstName;

	@NotNull(message = "Last name can not be null")
    @NotBlank(message = "Last name can not be white space")
    @Size(min = 2,max = 25,message = "First name '${validatedValue}' must be between {min} and {max} long")
	private String lastName;

	@NotNull(message = "Email name can not be null")
    @NotBlank(message = "Email name can not be white space")
	@Size(min = 4,max = 25,message = "Email '${validatedValue}' must be between {min} and {max} long")
	@Email(message = "Provide valid email")
	private String userMail;

	@NotNull(message = "Password name can not be null")
    @NotBlank(message = "Password can not be white space")
    @Size(min = 4,max = 250,message = "Password '${validatedValue}' must be between {min} and {max} long")
	private String password;
	
	@NotNull(message = "Phone Number name can not be null")
    @NotBlank(message = "Phone Number can not be white space")
    @Size(min = 10,max = 20,message = "Phone Number '${validatedValue}' must be between {min} and {max} long")
	private String phoneNumber;
	
	
}
