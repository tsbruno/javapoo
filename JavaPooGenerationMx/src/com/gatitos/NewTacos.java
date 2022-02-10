package com.gatitos;

public class NewTacos {

	public static void main(String[] args) {
		
		Taccos t  = new Taccos();
		
		//g.nombre = "taco"; 
		//g.patas = 4;
		
		t.setNombre("SUREÑO");
		t.setNumero(7);
		t.setPrecioGratis(false);
		
		System.out.println(t);
		System.out.println("nombre: "+ t.getNombre());
	}
	
	
}
