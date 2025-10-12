package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
public static void main (String args[])
	{
	
		Scanner entradaTeclado = new Scanner(System.in);
		//aqui todas las variables necesarias
		int num1;
		int num2;
		
		System.out.println("indique el numero 1");
		num1 = entradaTeclado.nextInt();
		System.out.println("indique el numero 2");
		num2 = entradaTeclado.nextInt();
		if(num1<num2) {
			System.out.println(num1 + " es menor que " + num2);
		}
		else if (num1>num2){
			System.out.println(num2 + " es menor que " + num1);
		}
		else {
			System.out.println("ambos son iguales");
		}
		entradaTeclado.close();
	}
}
