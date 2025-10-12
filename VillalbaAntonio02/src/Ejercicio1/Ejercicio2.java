package Ejercicio1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main (String args[])
	{
	
		
		String nombreEquipo;
		String nombreEstadio;
		String nombreCapitan;
		int anoFundacion;
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("¿cual es el nombre del equipo?");
		nombreEquipo = entradaTeclado.nextLine();
		System.out.println("¿cual es el nombre del estadio?");
		nombreEstadio = entradaTeclado.nextLine();
		System.out.println("¿cual es el nombre del capitan?");
		nombreCapitan = entradaTeclado.nextLine();
		System.out.println("¿cuando se fundo el equipo?");
		anoFundacion = entradaTeclado.nextInt();
		
		System.out.println("nombre del equipo: "+nombreEquipo);
		System.out.println("Fundado en: "+anoFundacion);
		System.out.println("nombre del estadio: "+nombreEstadio);
		System.out.println("nombre del capitan: "+nombreCapitan);
		
		
		
		entradaTeclado.close();
	}
}
