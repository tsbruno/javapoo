package com.generation;

public class Tacos {
	
	String tipoDeAlimento; 
    String tipoDeComida; 
    int numeroDeAlimento; 
    String tamanioDeComida; 
    float precio = 0.0f; 
    
    
    public Tacos() {
    	
    }
    
    
    public Tacos(String tipoDeTortilla) {
    	this.tipoDeAlimento = tipoDeTortilla; 
    }
    
    
    public Tacos(String tipoDeAlimento, String tipoDeComida,
    	int numeroDeAlimento, String tamanioDeComida, float precio ) {
    	this.tipoDeAlimento = tipoDeAlimento; 
    	this.tipoDeComida = tipoDeComida; 
    	this.numeroDeAlimento = numeroDeAlimento; 
    	this.tamanioDeComida = tamanioDeComida; 
    	this.precio = precio; 
    }
    
    
    
    void preparar() {
    	System.out.println("Preparacion en Proceso");
    }
    
    
    void vender() {
    	System.out.println("Alimento Vendido");
    }
    
    void ponerSalsa() {
    	System.out.println("Agregando adhereso");
    }
    
    void subirPrecio(float aumento) {
    	precio = precio + aumento ; 
    }


	
    
    
    
    
    
}
