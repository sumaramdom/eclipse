package Ejercicio1;

import java.util.Scanner;

public class Ejercicio2 {
public static void main (String args[])
	{
	
		Scanner entradaTeclado = new Scanner(System.in);
		//aqui todas las variables necesarias
		double nota;
		int edad;
		String nombre;
		
		System.out.println("¿cual se su nombre?");
		nombre = entradaTeclado.nextLine();
		System.out.println("¿cual es su edad?");
		edad = entradaTeclado.nextInt();
		System.out.println("¿cual es su nota?");
		nota = entradaTeclado.nextDouble();
		if(nota>=7 && nota<=10 && edad>=18 ) {
			System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas");
		}

		else {
			System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimo");
		}
		entradaTeclado.close();
	}
}

