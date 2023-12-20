package com.admin.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Document(collection = "washpacks")
public class WashPacks {

	@Id
	private Integer id;
	
    @NotBlank(message = "Packname cannot be blank")
	private String packname;  

    @Min(value = 0, message = "Amount must be a positive number or zero")
    private double amount;
     
    @Size(max = 255, message = "Description must not exceed 255 characters")
    private String description;
   
	public String getDescription() {
		return description;
	}
 
	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPackname() {
		return packname;
	}

	public void setPackname(String packname) {
		this.packname = packname;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {   
		this.amount = amount;
	}


	public WashPacks(int id, String packname, double amount, String description) {
		this.id = id;
		this.packname = packname;
		this.amount = amount;
		this.description = description;
	}

	public WashPacks() {
		          
	}

	

}

