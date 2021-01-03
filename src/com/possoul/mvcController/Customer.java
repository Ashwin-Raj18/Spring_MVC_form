//project details: This project is converted to maven project from dynamic web project, u need external tomcat to run
//xml based config
package com.possoul.mvcController;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	@NotNull(message="cant be white space")
	@Size(min=1, message="is required")
	private String lastName="Raj";

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








