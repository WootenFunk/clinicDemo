package com.demo.bean;

public class Doctor {

	private int	id;
	private String 	full_name;
	private int	specialty;
	private String	specialty_description;
	private String	address;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public int getSpecialty() {
		return specialty;
	}
	public void setSpecialty(int specialty) {
		this.specialty = specialty;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSpecialty_description() {
		return specialty_description;
	}
	public void setSpecialty_description(String specialty_description) {
		this.specialty_description = specialty_description;
	}	
	
}
