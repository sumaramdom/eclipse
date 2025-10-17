package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int num;
		
		do{

			System.out.println("indique un numero para sacar su cuadrado");
			num = entradaTeclado.nextInt();
			if (num>=0) {
				System.out.println("su cuadrado es: "+Math.pow(num, 2));
			}
			else {
				
			}
		}while (num>=0);
		
			
		
		entradaTeclado.close();
		
	}
}
