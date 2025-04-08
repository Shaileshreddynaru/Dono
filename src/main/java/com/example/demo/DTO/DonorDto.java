package com.example.demo.DTO;

import org.springframework.stereotype.Component;

@Component
public class DonorDto {

	
	
	private String don_name;
	private String don_email;
	private int don_amount;
	
	public String getDon_email() {
		return don_email;
	}
	public void setDon_email(String don_email) {
		this.don_email = don_email;
	}
	
	public String getDon_name() {
		return don_name;
	}
	public void setDon_name(String don_name) {
		this.don_name = don_name;
	}
	public int getDon_amount() {
		return don_amount;
	}
	public void setDon_amount(int don_amount) {
		this.don_amount = don_amount;
	}
	
	
}
