package com.demo.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.bean.Doctor;
import com.demo.rest.RestService;
import com.demo.util.MySqlDBConn;
import org.apache.log4j.Logger;

public class DoctorDAO {

	static Logger log = Logger.getLogger(RestService.class.getName());
	
	public ArrayList<Doctor> allDoctors() {
		
		ArrayList<Doctor> array_doctor = new ArrayList<Doctor>();
		Connection cn = MySqlDBConn.obtenerConexion();
		log.info("3.Entró a allDoctors... findDoctor");
		try {

			String sql = "select * from doctor;";

			PreparedStatement pst = cn.prepareStatement(sql);
			log.info("4.Por ejecutar sql allDoctors... findDoctor: "+sql);
			System.out.println(pst);

			ResultSet rs = pst.executeQuery();
			log.info("5.Ejecutó ResultSet allDoctors... findDoctor");
			while (rs.next()) {
				log.info("6.Entró al while allDoctors... findDoctor");
				Doctor obj_doctor = new Doctor();
				obj_doctor.setId(rs.getInt(1));
				obj_doctor.setFull_name(rs.getString(2));
				obj_doctor.setSpecialty(rs.getInt(3));
				obj_doctor.setAddress(rs.getString(4));	
				
				array_doctor.add(obj_doctor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return array_doctor;
	}
	
	public ArrayList<Doctor> findDoctor(String speciality, String city){
		
		ArrayList<Doctor> array_doctor = new ArrayList<Doctor>();
		Connection cn = MySqlDBConn.obtenerConexion();
		log.info("3. Connection - findDoctor");
		try {

			String sql = "select d.id, d.full_name, s.description, d.address" + 
					" from doctor d inner join config s on" + 
					" d.specialty = s.code" + 
					" where d.address like '%"+city+"%' and" + 
					"		s.table = 3 and" + 
					"		s.description like '%"+speciality+"%';";

			log.info("4.Por ejecutar sql allDoctors... findDoctor: "+sql);
			PreparedStatement pst = cn.prepareStatement(sql);

			System.out.println(pst);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				Doctor obj_doctor = new Doctor();
				obj_doctor.setId(rs.getInt(1));
				obj_doctor.setFull_name(rs.getString(2));
				obj_doctor.setSpecialty_description(rs.getString(3));
				obj_doctor.setAddress(rs.getString(4));	
				
				array_doctor.add(obj_doctor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return array_doctor;
	}
}
