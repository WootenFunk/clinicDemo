package com.demo.bean;

public class Review {
	
	private Integer	id;	
	private String 	dni;
	private Integer	id_doctor;	
	private Double 	rating;
	private String 	review;
	private String 	date;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Integer getId_doctor() {
		return id_doctor;
	}
	public void setId_doctor(Integer id_doctor) {
		this.id_doctor = id_doctor;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}