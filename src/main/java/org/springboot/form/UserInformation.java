package org.springboot.form;

import javax.validation.constraints.Size;

public class UserInformation{
	
	@Size(min=1, max=50)
	private String name;
	
	@Size(min=1, max= 100)
	private String surname;
	
	@Size(min=1, max= 1000)
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
