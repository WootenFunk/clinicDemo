package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.demo.util.MySqlDBConn;

public class ObraDAO {
	
public String buscaNombreObra(int idFuncion) throws Exception{
		
		String nomObra = null;
		
		Connection cn = MySqlDBConn.obtenerConexion();

		String sql=String.format("select nombre from obra a,funcion b where a.id_obra = b.id_obra and id_funcion = %d", idFuncion);

		
		PreparedStatement pst=cn.prepareStatement(sql);
		
		System.out.println(pst);

		
		ResultSet rs=pst.executeQuery();

		if(rs.next()){	
			nomObra = rs.getString(1);
		}
		
		cn.close();		
	
		return nomObra;
	}

}
