package com.demo.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.demo.bean.Doctor;
import com.demo.dao.DoctorDAO;

import com.google.gson.Gson;

@Path("/clinic")
public class RestService {

	static Logger log = Logger.getLogger(RestService.class.getName());
	Gson g = new Gson();
	
	@GET
	@Path("/doctors")
	@Consumes("application/json")
	public Response getAllDoctors(){
		log.info("1.Ingreso al metodo getAllDoctors");
		
		ArrayList<Doctor> array_doctor = new ArrayList<Doctor>();
		
		Gson g = new Gson ();
		
		DoctorDAO doctor_dao = new DoctorDAO();
		
		try {
			log.info("2.Previo a Listar Doctores... allDoctors");
			array_doctor = doctor_dao.allDoctors();
			if(array_doctor.size() > 0){
				log.info("7.Encontró Doctores... findDoctor");
			}
		} catch (Exception e) {
			log.error("Error en la búsqueda de Doctores");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		
		log.error("8. Antes de toJson");
		//String doctors_Json = g.toJson(doctor_dao, Doctor.class);
		String doctors_Json = g.toJson(array_doctor);
		log.error("Respuesta: " + doctors_Json);
		System.out.println("Respuesta: " + doctors_Json);
		
		return Response.status(200).entity(doctors_Json).build();
			
	}
	
	@GET
	@Path("/doctor")
	@Consumes("application/json")
	public Response getDoctors(String specialty, String city){
		log.info("1.Ingreso al metodo getDoctors con el specialty: " + specialty + " y city: " + city);
		
		specialty = "m"; city="Lima";
		log.info("2.Ingreso al metodo getDoctors con el specialty: " + specialty + " y city: " + city);
		ArrayList<Doctor> array_doctor = new ArrayList<Doctor>();
		
		Gson g = new Gson ();
		//System.out.println("Codigo de specialty: " + specialty.replace("\"", ""));
		
		DoctorDAO doctor_dao = new DoctorDAO();
		
		try {
			array_doctor = doctor_dao.findDoctor(specialty,city);
			if(array_doctor.size() > 0){
				log.info("Encontró Doctores... findDoctor");
			}
		} catch (Exception e) {
			log.error("Error en la búsqueda de Doctores");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		
		
		String doctors_Json = g.toJson(array_doctor);
		System.out.println("Respuesta: " + doctors_Json);
		
		return Response.status(200).entity(doctors_Json).build();
		
		
	}
	
	@GET
	@Path("/reviews")
	@Consumes("application/json")
	public Response getReviews(String doctor_id){
		log.info("1.Ingreso al metodo getReviews con el doctor_id: " + doctor_id);
		
		doctor_id = "1000";
		log.info("2.Ingreso al metodo getReviews con el doctor_id: " + doctor_id);
		ArrayList<Doctor> array_doctor = new ArrayList<Doctor>();
		
		Gson g = new Gson ();
		//System.out.println("Codigo de specialty: " + specialty.replace("\"", ""));
		
		DoctorDAO doctor_dao = new DoctorDAO();
		
		try {
			//array_doctor = review_dao.findReviewsByDoctor(doctor_id);
			if(array_doctor.size() > 0){
				log.info("Encontró Doctores... findDoctor");
			}
		} catch (Exception e) {
			log.error("Error en la búsqueda de Doctores");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		
		
		String doctors_Json = g.toJson(array_doctor);
		System.out.println("Respuesta: " + doctors_Json);
		
		return Response.status(200).entity(doctors_Json).build();
		
		
	}
	
}
