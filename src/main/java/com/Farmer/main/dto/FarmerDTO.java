package com.Farmer.main.dto;





import com.Farmer.main.model.Farmer;

public class FarmerDTO {
	private Long id;
	private String itemtype;
	private String itemname;

	private String email;
	private long mobilenumber;


	private int price;
	
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getItemtype() {
		return itemtype;
	}


	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}


	public String getItemname() {
		return itemname;
	}


	public void setItemname(String itemname) {
		this.itemname = itemname;
	}


	
	
	
 public FarmerDTO() {
		
	}


 	
 	public FarmerDTO(Farmer farmer)
 	{
 		this.itemtype=farmer.getItemtype();
 		this.itemname=farmer.getItemname();
 		this.id=farmer.getId();
 		this.email=farmer.getEmail();
 		this.mobilenumber=farmer.getMobilenumber();
 		this.price=farmer.getPrice();
 		
 	}



}
