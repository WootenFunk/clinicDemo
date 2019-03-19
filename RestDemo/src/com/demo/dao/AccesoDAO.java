package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.demo.util.MySqlDBConn;

public class AccesoDAO {
	
	public boolean ingresaAcceso(String numeroEntrada, int idFuncion) throws Exception{
		try {
			Connection cn = MySqlDBConn.obtenerConexion();

			String sql=String.format("insert into acceso values ('%s',%d,now(), "
					+ "ADDDATE(now(), INTERVAL 1 DAY),0)",numeroEntrada, idFuncion);
			
			PreparedStatement pst=cn.prepareStatement(sql);
			
			System.out.println(pst);
			
			pst.execute();
			
			cn.close();		
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		

		return true;
	}
}
