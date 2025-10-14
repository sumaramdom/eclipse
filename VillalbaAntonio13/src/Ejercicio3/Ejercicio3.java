package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String args[])
	{
	
		Scanner entradaTeclado = new Scanner(System.in);
		int num1;
		int num2;
		int magiaRAM;
		
		System.out.println("inserte numero 1");
		num1 = entradaTeclado.nextInt();
		
		System.out.println("inserte numero 2");
		num2 = entradaTeclado.nextInt();
		magiaRAM = num2;
		num2 = num1;
		num1 = magiaRAM;
		
		System.out.println("numero 1 es ahora "+num1+" y numero 2 es "+num2);
		entradaTeclado.close();
		
		
	}
}
