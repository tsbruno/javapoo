package com.generation;

public class Main {

	public static void main(String[] args) {
		
		
		Tacos taco1 = new Tacos("masa","carne", 2, "mediana", 30); 
		
		
		/*
		 * taco1.tipoDeAlimento = "harina"; taco1.tipoDeAlimento = "carne";
		 * taco1.numeroDeAlimento = 2; taco1.tamañoDeComida = "grande"; taco1.precio =
		 * 100;
		 */
		taco1.subirPrecio(5.5f);
		
		
		System.out.println(taco1.toString());
		
		
		Tacos taco2 = new Tacos();
		taco2.tipoDeComida = "harina";
		taco2.tipoDeAlimento = "carne de res";
		taco2.numeroDeAlimento = 1;
		taco2.tamanioDeComida = "grande";
		taco2.precio = 45.5f;
		taco2.tipoDeAlimento = "trigo verde";
		
		Tacos taco3 = new Tacos("maiz"); 
		
		  
		System.out.println(taco1);
		System.out.println(taco2);
		System.out.println(taco3);
		 
		
		
	}

}
