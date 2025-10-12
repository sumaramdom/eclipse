package Ejercicio1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		String nombre;
		String apellidos;
		String ciclo;
		double notaTotal;
		int notaFinal;
		String resultado;
		boolean error;
		resultado = "";
		
		error = false;
		
		System.out.println("¿cual es tu nombre?");
		nombre = entradaTeclado.nextLine();
		System.out.println("¿cuales son tus apellidos?");
		apellidos = entradaTeclado.nextLine();
		System.out.println("¿cual es el ciclo al que ingresa?");
		ciclo = entradaTeclado.nextLine();
		System.out.println("¿cual es tu nota?");
		notaTotal = entradaTeclado.nextDouble();
		

				
		
		
		notaFinal = (int)Math.floor(notaTotal);
		switch (notaFinal) {
			case 0,1,2,3,4:
			
				resultado = "suspenso"; 
			break;
			case 5,6:
				resultado = "bien";
			break;
			case 7,8:
				resultado = "notable";
			break;
			case 9:
				resultado = "sobresaliente";
			break;
			case 10:
				resultado = "sobresaliente, matricula de honor";
			break;
			default:
				System.out.println("error en la nota");
				error = true;
				
				break;
		}
		if (error = false) {
			System.out.println("nombre: "+nombre );
			System.out.println("apellidos: "+apellidos );
			System.out.println("Ciclo formativo: "+ciclo );
			System.out.println("nota academica: "+notaTotal + " ("+ resultado + ")" );
		}
		else {
			System.out.println("no se pudo continuar");
		}
		
		entradaTeclado.close();
		
	}
}