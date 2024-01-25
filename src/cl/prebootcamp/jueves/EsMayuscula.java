package cl.prebootcamp.jueves;

import java.util.Scanner;

public class EsMayuscula {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}
	
	public static void run() {
		
		for(int i=1 ; i<5 ; i++ ) {
			System.out.println("valor-----> "+i);
			dibujarPregunta();
		}
		
	}
	public static void dibujarPregunta() {
		Scanner objScanner = new Scanner(System.in);
		System.out.print("ingresa un caracter-----> ");
		String entrada =  objScanner.next();
		
		char caracter= entrada.charAt(0);
		validar(caracter);
	}
	
	public static void validar(char caracter) {
		if(Character.isUpperCase(caracter)) {
		    System.out.println(caracter+"------>Es mayuscula ");
		} else {
		    System.out.println(caracter+"------>Es minuscula ");
		}
	}

}
