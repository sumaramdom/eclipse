package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String args[])
	{
	
		
		String nombre;
		String apellidos;
		String direccion;
		int edad;
		double altura;
		double peso;
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("¿cual es tu nombre?");
		nombre = entradaTeclado.nextLine();
		System.out.println("¿cuales son tus apellidos?");
		apellidos = entradaTeclado.nextLine();
		System.out.println("¿donde vive?");
		direccion = entradaTeclado.nextLine();
		System.out.println("¿cual es su edad?");
		edad = entradaTeclado.nextInt();
		System.out.println("¿cual es su altura?");
		altura = entradaTeclado.nextDouble();
		System.out.println("¿cual es su peso?");
		peso = entradaTeclado.nextDouble();
		
		System.out.println("nombre: "+nombre);
		System.out.println("apellidos: "+apellidos);
		System.out.println("direccion: "+direccion);
		System.out.println("edad: "+edad);
		System.out.println("peso: "+peso);
		System.out.println("altura: "+altura);
		
		
		entradaTeclado.close();
	}
}
