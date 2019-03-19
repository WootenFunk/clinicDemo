package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.demo.util.MySqlDBConn;

public class FuncionDAO {
	
public String buscaInicioFuncion(int idFuncion) throws Exception{
		
		String iniObra = null;
		
		Connection cn = MySqlDBConn.obtenerConexion();

		String sql=String.format("select hora_inicio from funcion where id_funcion = %d", idFuncion);

		
		PreparedStatement pst=cn.prepareStatement(sql);
		
		System.out.println(pst);

		
		ResultSet rs=pst.executeQuery();

		if(rs.next()){	
			iniObra = rs.getTime(1).toString();
		}
		
		cn.close();		
	
		return iniObra;
	}

}
