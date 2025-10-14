package Ejercicio1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		
		double importeGastado1;
		double importeGastado2;
		double importeGastado3;
		double importeGastado4;
		double importeMedio;
		String nombre;
		String apellido;
		
		System.out.println("¿cual es su nombre?");
		nombre = entradaTeclado.nextLine();
		System.out.println("¿cuales son sus apellidos?");
		apellido = entradaTeclado.nextLine();
		
		System.out.println("¿cual es el importe gastado (1)?");
		importeGastado1 = entradaTeclado.nextDouble();
		System.out.println("¿cual es el importe gastado (2)?");
		importeGastado2 = entradaTeclado.nextDouble();
		System.out.println("¿cual es el importe gastado (3)?");
		importeGastado3 = entradaTeclado.nextDouble();
		System.out.println("¿cual es el importe gastado (4)?");
		importeGastado4 = entradaTeclado.nextDouble();
		importeMedio = (importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4)/4 ;
		
		//se suma todos los importes
		if (importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4 >= 300) {
			System.out.println("nombre:" + nombre );
			System.out.println("apellidos:" + apellido );
			System.out.println("importe gastado1:" + importeGastado1 );
			System.out.println("importe gastado2:" + importeGastado2 );
			System.out.println("importe gastado3:" + importeGastado3 );
			System.out.println("importe gastado4:" + importeGastado4 );
			System.out.println(" ");
			System.out.println("media por compra:" + importeMedio );
			
			System.out.println("¡HENORABUENA! HA OBTENDO UN BONO DE 50€");
		}
		else {
			System.out.println("nombre:" + nombre );
			System.out.println("apellidos:" + apellido );
			System.out.println("importe gastado1:" + importeGastado1 );
			System.out.println("importe gastado2:" + importeGastado2 );
			System.out.println("importe gastado3:" + importeGastado3 );
			System.out.println("importe gastado4:" + importeGastado4 );
			System.out.println(" ");
			System.out.println("media por compra:" + importeMedio );
			
			System.out.println("no podemos farle el bono de 50€");
		}
		
		
		entradaTeclado.close();
	}

}
