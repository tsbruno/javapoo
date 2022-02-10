package com.gatitos;

public class Taccos {

	
	private String nombre; 
	private int numero;
	private boolean precioGratis;
 
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero(int numero) {
		
		
		return numero;
	}
	public void setNumero(int numero) {
		
		if(numero >= 0 && numero < 5) {
			this.numero = numero; 
		}else {
			throw new IllegalArgumentException("ya es mucho"); 
		}
		
	}
	public boolean isPrecioGratis() {
		return precioGratis;
	}
	public void setPrecioGratis(boolean precioGratis) {
		this.precioGratis = precioGratis;
	}
	@Override
	public String toString() {
		return "Taccos [nombre=" + nombre + ", numero=" + numero + ", precio=" + precioGratis + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
