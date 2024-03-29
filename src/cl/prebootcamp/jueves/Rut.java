package cl.prebootcamp.jueves;

import java.util.Scanner;

public class Rut {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		System.out.print("ingresa un rut-----> ");
		String entrada =  objScanner.next();
		
		if(validar(entrada)) {
		    System.out.println(format(entrada)+"------>Es Válido ");
		} else {
		    System.out.println(format(entrada)+"------>Es Inválido ");
		}
		

	}
	
	public static boolean validar(String rut) {
		if(rut ==null){
			return false;
		}
        rut =  rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

        if(rutAux<1000000){
            return false;
        }

        char dv = rut.charAt(rut.length() - 1);


        int m = 0, s = 1;
        for (; rutAux != 0; rutAux /= 10) {
            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
        }
        if (dv != (char) (s != 0 ? s + 47 : 75)) {
            return false;
        }
        
        
        return true;
        
    }
	public static String format(String rut) {
        if(rut == null){
            return null;
        }
        int cont = 0;
        String format;
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        format = "-" + rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            format = rut.substring(i, i + 1) + format;
            cont++;
            if (cont == 3 && i != 0) {
                format = "." + format;
                cont = 0;
            }
        }
        return format;
    }

}
