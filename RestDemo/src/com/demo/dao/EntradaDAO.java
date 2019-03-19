package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.demo.bean.Entrada;
import com.demo.util.MySqlDBConn;

public class EntradaDAO {
	
public Entrada buscaPorEntrada(String entrada) throws Exception{
		
		Entrada entradaDisponible = null;
		Connection cn = MySqlDBConn.obtenerConexion();
		try {
			
			String sql=String.format("select * from entrada where numero like '%s'", entrada);
			
			PreparedStatement pst=cn.prepareStatement(sql);
			
			System.out.println(pst);
			
			ResultSet rs=pst.executeQuery();

			while(rs.next()){	
				entradaDisponible = new Entrada();
				entradaDisponible.setNumero(entrada);
				entradaDisponible.setFecha(rs.getDate(1));
				entradaDisponible.setPuntoVenta(rs.getString(3));
				entradaDisponible.setZona(rs.getString(4));
				entradaDisponible.setFila(rs.getString(5));
				entradaDisponible.setButaca(rs.getString(6));
				entradaDisponible.setValorVenta(rs.getDouble(7));
				entradaDisponible.setEstado(rs.getInt(8));
				entradaDisponible.setIdFuncion(rs.getInt(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		cn.close();		
	
		return entradaDisponible;
	}

public boolean modificaEntrada(String entrada) throws Exception{
	
	Connection cn = MySqlDBConn.obtenerConexion();

	String sql=String.format("update entrada set estado = 1 where numero like '%s'",entrada);
	
	PreparedStatement pst=cn.prepareStatement(sql);
	
	System.out.println(pst);
	
	pst.execute();
	
	cn.close();		
	

	return true;
}
	
}
