package com.grupoatrium.modelo;

public class Autor {
	
	private String nombre;
	private String nacionalidad;
	private String comentarios;
	
	
	//constructor por defecto
	
	public Autor() {
	    }
	//contructor con todos los atributos
	public Autor(String nombre, String nacionalidad, String comentarios) {
	        this.nombre = nombre;
	        this.nacionalidad = nacionalidad;
	        this.comentarios = comentarios;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	
    public String toString() {
        return  "Autor \n"+"nombre: "+this.getNombre()+"\n"+
        		"nacionalidad: "+this.getNacionalidad()+ "\n"+
        		"comentarios: "+this.getComentarios()+ "\n";
    }
}