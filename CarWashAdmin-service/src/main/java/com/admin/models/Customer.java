package com.admin.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Document("customer")
public class Customer {

	@Id
	private int id;

	@NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Password cannot be blank")
    private String password;

    @NotBlank(message = "Address cannot be blank")
    private String address;

    @Email(message = "Invalid email address")
    private String emailAddress;

    @NotBlank(message = "Car model cannot be blank")
    private String carModel;

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public Customer() {
		
	}
	

	public Customer(int id, String name, String password, String address, String emailAddress, String carModel,
			String role) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.emailAddress = emailAddress;
		this.carModel = carModel;
		this.role = role;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}



}
