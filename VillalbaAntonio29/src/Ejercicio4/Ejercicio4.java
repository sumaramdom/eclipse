package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String args[])
	
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int contador;

		
		System.out.println("indique el numero al que quieras llegar");
		contador = entradaTeclado.nextInt();
		
		
		
		for (int i=1;i<=contador;i++) {
			System.out.println(i);
		}
		
		
		
		entradaTeclado.close();
		
	}
}
