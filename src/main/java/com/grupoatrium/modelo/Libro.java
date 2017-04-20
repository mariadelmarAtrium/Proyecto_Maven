package com.grupoatrium.modelo;


import java.util.List;


public class Libro {

	private String isbn;
	private String titulo;
	private List<Autor> autores;
	private Editorial editorial;
	private int publicacion;
	private double precio;
	private String descripcion;
	
	
	//constructor por defecto
	
	 public Libro() {
	    }

	 //contructor con todos los atributos
	    public Libro(String titulo, String isbn, int publicacion, double precio,String descripcion) {
	        this.titulo = titulo;
	        this.isbn = isbn;
	        this.publicacion = publicacion;
	        this.precio=precio;
	        this.descripcion=descripcion;
    }
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void getAutores() {
		//return autores;
		 for(int i=0; i< this.autores.size(); i++) {
	            System.out.println(this.autores.get(i));
	     }
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public void getEditorial() {
		//return editorial;
		System.out.println(this.editorial.toString());
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	public int getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String toString() {
	    return "Libro " + "\n titulo =" + this.getTitulo() +"\n"+
	        			  " isbn =" + this.getIsbn() +"\n"+
	        			  " publicacion =" + this.getPublicacion() + "\n"+
  	        		      " precio =" + this.getPrecio()+ "€ "+"\n"+
  	        		      " descripcion =" + this.getDescripcion()+"\n"+
	           			  " Editorial  \n " + this.editorial.toString()+"\n"+
	           			  this.autores.toString()+ "\n";
	        			 
	    
	}
}
