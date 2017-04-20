package com.grupoatrium.modelo;


public class Editorial {
	
	private String nombre;
	private Direccion direccion;
	private String nif;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public String toString() {
	    return  "nombre =" + nombre +"\n"+
	    		"nif =" + this.nif+ "\n"+
	    		"Direccion \n"+this.direccion.toString()+"\n";
	}
}
