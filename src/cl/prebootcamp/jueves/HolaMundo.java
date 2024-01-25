package cl.prebootcamp.jueves;


import java.util.Scanner;

public class HolaMundo {
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		System.out.println("Prebootcamp");
		
		
		Scanner objScanner = new Scanner(System.in);
		
		
		System.out.print("Ingresa un texto:");
		String entrada =  objScanner.next();
		
		
		
		
		System.out.println(entrada);
		
		System.out.println("Termine mi ejecución");
	}

}
