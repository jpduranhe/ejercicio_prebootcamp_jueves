package cl.prebootcamp.jueves;

import java.util.Scanner;

public class Sumador {
	
	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		Scanner objScanner = new Scanner(System.in);
		
		System.out.print("Ingresa el primer numero: ");
		numero1 = objScanner.nextInt();
		
		System.out.print("Ingresa el segundo numero: ");
		numero2 = objScanner.nextInt();
		
		int total= numero1+numero2;
		
		
		System.out.print("El Total es: "+total);
		
	}
	

}
