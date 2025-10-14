package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main (String args[])
	{
	
		Scanner entradaTeclado = new Scanner(System.in);
		double euros;
		double pesetas;
		
		System.out.println("ponga cantidad de euros para peseta");
		euros = entradaTeclado.nextDouble();
		pesetas = euros*166.386;
		System.out.println(euros+" euros equivalen a "+pesetas+" pesetas");
		
		System.out.println("ponga cantidad de pesetas para euros");
		pesetas = entradaTeclado.nextDouble();
		euros = pesetas/166.386;
		System.out.println(pesetas+" pesetas equivalen a "+euros+" euros");
		entradaTeclado.close();
	}
}
