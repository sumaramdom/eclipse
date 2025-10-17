package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		double numAzar;
		//int numAzarFix;
		int numOfre;
		numAzar=50*(Math.random());
		numAzar=Math.round(numAzar);
		//System.out.println(numAzar);/*chetos*/
		System.out.println("adivina el numero(1-50)");
		do{

			
			numOfre = entradaTeclado.nextInt();
			if (numAzar!=numOfre) {
				System.out.println("prueba otra vez!");
			}
			else {
				
			}
		}while (numAzar!=numOfre);
		System.out.println("henorabuena!!!!");
			
		
		entradaTeclado.close();
	}
}
