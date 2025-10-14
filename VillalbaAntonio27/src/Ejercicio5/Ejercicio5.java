package Ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {
	
	public static void main (String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		double val1;
		double val2;
		int oper;
		double result = 0;
		
		System.out.println("Introduzca valor1");
		val1 = entradaTeclado.nextDouble();
		System.out.println("Introduzca valor2");
		val2 = entradaTeclado.nextDouble();
		System.out.println("Indique la operacion que quiere realizar (inserte un numero):");
		System.out.println("(1)suma");
		System.out.println("(2)resta");
		System.out.println("(3)multiplicacion");
		System.out.println("(4)division");
		oper = entradaTeclado.nextInt();
		switch (oper) {
		case 1:
		
			result = val1+val2; 
			break;
		case 2:
			
			result = val1-val2; 
			break;
		case 3:
			
			result = val1*val2; 
			break;
		case 4:

			result = val1/val2; 
			break;
		default:
			System.out.println("error, inserte un numero valido la proxima vez");
			break;
		}
		System.out.println("resultado: "+ result);
		entradaTeclado.close();
	}
}

