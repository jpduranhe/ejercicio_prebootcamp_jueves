package cl.prebootcamp.jueves;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class SaberTuEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		run();
		
	}
	
	public static void run() {
		Scanner objScanner = new Scanner(System.in);

		System.out.print("Ingresa un tu fecha de cumpleaños yyyy-mm-dd: ");
		String entrada =  objScanner.next();
		
		
		LocalDate fechaCumpleanos= LocalDate.parse(entrada);
		
		LocalDate fechaActual= LocalDate.now();
		
		Period objPeriodo = Period.between(fechaCumpleanos, fechaActual);
		
		System.out.printf("Hola tu tienes %s años %s meses y %s dia",objPeriodo.getYears(),objPeriodo.getMonths(),objPeriodo.getDays());
	}

}
