package com.demo.bean;

import java.util.Date;

public class Entrada {
	private Date fecha;
	private String numero;
	private String puntoVenta;
	private String zona;
	private String fila;
	private String butaca;
	private double valorVenta;
	private Integer estado;
	// 0 Disponible
	// 1 No disponible
	private int idFuncion;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getPuntoVenta() {
		return puntoVenta;
	}
	public void setPuntoVenta(String puntoVenta) {
		this.puntoVenta = puntoVenta;
	}

	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getFila() {
		return fila;
	}
	public void setFila(String fila) {
		this.fila = fila;
	}
	public String getButaca() {
		return butaca;
	}
	public void setButaca(String butaca) {
		this.butaca = butaca;
	}
	public double getValorVenta() {
		return valorVenta;
	}
	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public int getIdFuncion() {
		return idFuncion;
	}
	public void setIdFuncion(int idFuncion) {
		this.idFuncion = idFuncion;
	}
	
	
	
}
