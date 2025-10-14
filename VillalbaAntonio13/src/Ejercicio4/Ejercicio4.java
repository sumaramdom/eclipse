package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String args[])
	{
	
		Scanner entradaTeclado = new Scanner(System.in);
		double numero;
		double resultado;
		
		System.out.println("inserte numero double");
		numero = entradaTeclado.nextDouble();
		resultado=Math.round(numero);
		System.out.println("sale redondeado como "+resultado);
		resultado=Math.ceil(numero);
		System.out.println("sale redondeado acia arriba como "+resultado);
		resultado=Math.floor(numero);
		System.out.println("y sale truncado como "+resultado);
		
		
		entradaTeclado.close();
		
		
	}
}
