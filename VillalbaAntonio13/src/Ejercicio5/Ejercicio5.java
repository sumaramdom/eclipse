package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main (String args[])
	{
	
		Scanner entradaTeclado = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("inserte numero 1");
		num1 = entradaTeclado.nextInt();
		System.out.println("inserte numero 1");
		num2 = entradaTeclado.nextInt();
		System.out.println("el menor es: "+Math.min(num1, num2));
		System.out.println("la potencia del primer numero por el segundo es: "+Math.pow(num1, num2));
		System.out.println("la raiz cuadrada del segundo es: "+Math.sqrt(num1));
		System.out.println("un valor random del segundo numero: "+Math.random()*num2);
		
		entradaTeclado.close();
	}
}
