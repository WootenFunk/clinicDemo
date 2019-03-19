package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.demo.bean.OpcionEntrada;
import com.demo.util.MySqlDBConn;

public class OpcionEntradaDAO {
	
public ArrayList<OpcionEntrada> buscaOpcionPorTipoEntrada(String tipoEntrada) throws Exception{
		
	ArrayList<OpcionEntrada> listOpcEnt = new ArrayList<OpcionEntrada>();
		
		/*Connection cn = MySqlDBConn.obtenerConexion();

		String sql=String.format("select descripcion, a.estado from opcion_entrada a, opcion b where "
				+ "a.id_opcion = b.id_opcion and "
				+ "id_tipo_entrada = %d", tipoEntrada);

		
		PreparedStatement pst=cn.prepareStatement(sql);
		
		System.out.println(pst);

		
		ResultSet rs=pst.executeQuery();

		if(rs.next()){	
			OpcionEntrada opcEnt = new OpcionEntrada();
			opcEnt.setOpcion(rs.getString(1));
			opcEnt.setEstado(rs.getInt(2));
			
		}
		
		cn.close();	*/	
	
	OpcionEntrada opcEnt = new OpcionEntrada();
	if(tipoEntrada.equals("General")){
		opcEnt.setOpcion("Obra");
		opcEnt.setEstado(0);
		listOpcEnt.add(opcEnt);
		opcEnt.setOpcion("Historia");
		opcEnt.setEstado(1);
		listOpcEnt.add(opcEnt);
		opcEnt.setOpcion("Actores");
		opcEnt.setEstado(0);
		listOpcEnt.add(opcEnt);
		opcEnt.setOpcion("Puesta en Escena");
		opcEnt.setEstado(0);
		listOpcEnt.add(opcEnt);
	}
	if(tipoEntrada.equals("VIP")){
		opcEnt.setOpcion("Obra");
		opcEnt.setEstado(0);
		listOpcEnt.add(opcEnt);
		opcEnt.setOpcion("Historia");
		opcEnt.setEstado(0);
		listOpcEnt.add(opcEnt);
		opcEnt.setOpcion("Actores");
		opcEnt.setEstado(0);
		listOpcEnt.add(opcEnt);
		opcEnt.setOpcion("Puesta en Escena");
		opcEnt.setEstado(0);
		listOpcEnt.add(opcEnt);
	}
	
		return listOpcEnt;
	}
	
}
