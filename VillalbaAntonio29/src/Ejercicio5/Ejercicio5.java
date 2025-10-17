package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
public static void main (String args[])
	
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int contador;
		int calculo;
		int resultado=1;
		String factorialTxt="";
		do {
			System.out.println("indique el numero al que quieras llegar");
			contador = entradaTeclado.nextInt();
			if (contador<=0) {
				System.out.println("tiene que ser positivo");
			}
		} while (contador<=0);
		
		calculo=contador;
		resultado=contador;
		do {
			factorialTxt=factorialTxt+calculo+" * ";
			calculo--;
			resultado=resultado*(calculo);
			
		}while(calculo!=1);
		factorialTxt=factorialTxt+"1";
		System.out.println("el total es "+resultado);
		System.out.println(contador+"! = "+factorialTxt);
		
		entradaTeclado.close();
		
	}
}
