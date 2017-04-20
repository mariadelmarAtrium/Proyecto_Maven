package com.grupoatrium.modelo;

public class Direccion {
	
	private String calle;
	private int numero;
	private String poblacion;
	private int cp;
	private String provincia;
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String toString() {
	    return   "calle =" + calle +"\n"+
	        	 " numero =" + numero +"\n"+
	        	 " poblacion =" + poblacion+"\n"+
	    		 " cp ="+cp+"\n"+
	    		 " provincia ="+provincia;
	}
}
