package Ejercicio1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		
		int edad;
		String nombre;
		String apellido;
		
		System.out.println("¿cual es su edad?");
		edad = entradaTeclado.nextInt();
		if (edad >= 18) {
			System.out.println("¿cual es su nombre?");
			entradaTeclado.nextLine(); //esto solo se hace cuando el scaner escanea un int y luego un string
			nombre = entradaTeclado.nextLine();
			System.out.println("¿cuales son sus apellidos?");
			apellido = entradaTeclado.nextLine();
			
			System.out.println("nombre:" + nombre );
			System.out.println("apellidos:" + apellido );
			System.out.println("edad:" + edad );
			System.out.println(" ");
			System.out.println("usted ha sido admitido");
		}
		else {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
		}
		
		entradaTeclado.close();
	}

}
