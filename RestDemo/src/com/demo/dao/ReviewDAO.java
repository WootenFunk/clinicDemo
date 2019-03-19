package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.demo.bean.Doctor;
import com.demo.bean.Review;
import com.demo.rest.RestService;
import com.demo.util.MySqlDBConn;

public class ReviewDAO {
	static Logger log = Logger.getLogger(RestService.class.getName());
	
	public ArrayList<Review> findReviewsByDoctor() {
		
		ArrayList<Review> array_review = new ArrayList<Review>();
		Connection cn = MySqlDBConn.obtenerConexion();
		log.info("3.Entró a findReviewsByDoctor...");
		try {

			String sql = "select * from doctor;";

			PreparedStatement pst = cn.prepareStatement(sql);
			log.info("4.Por ejecutar sql allDoctors... findDoctor: "+sql);
			System.out.println(pst);

			ResultSet rs = pst.executeQuery();
			log.info("5.Ejecutó ResultSet allDoctors... findDoctor");
			while (rs.next()) {
				log.info("6.Entró al while allDoctors... findDoctor");
				Review obj_review = new Review();
				obj_review.setId(rs.getInt(1));
				//obj_review.set(rs.getString(2));
				//obj_review.setSpecialty(rs.getInt(3));
				//obj_review.setAddress(rs.getString(4));	
				
				array_review.add(obj_review);
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

		return array_review;
	}
}
