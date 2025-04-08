package com.example.demo.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.lang.*;
@Entity
@Component

public class Donors {
	public Donors() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  don_id;
	private String don_name;
	private String don_email;
	private int don_amount;
	
	
	public Donors(int don_id, String don_name, String don_email, int don_amount) {
		super();
		this.don_id = don_id;
		this.don_name = don_name;
		this.don_email = don_email;
		this.don_amount = don_amount;
	}
	public int getDon_id() {
		return don_id;
	}
	public void setDon_id(int don_id) {
		this.don_id = don_id;
	}
	public String getDon_name() {
		return don_name;
	}
	public void setDon_name(String don_name) {
		this.don_name = don_name;
	}
	public String getDon_email() {
		return don_email;
	}
	public void setDon_email(String don_email) {
		this.don_email = don_email;
	}
	public int getDon_amount() {
		return don_amount;
	}
	public void setDon_amount(int don_amount) {
		this.don_amount = don_amount;
	}
	
	
	
}
