package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String args[])
	{
	
		Scanner entradaTeclado = new Scanner(System.in);
		String nombre;
		String apellidos;
		String fechaN;
		double salarioBr;
		int anosTrabajados;
		int aumentoSalario;
		double salarioTotal;
		
		double salarioNeto;
		
		System.out.println("indique su nombre:");
		nombre = entradaTeclado.nextLine();
		System.out.println("indique sus apellidos:");
		apellidos = entradaTeclado.nextLine();
		System.out.println("indique su fecha de nacimiento:");
		fechaN = entradaTeclado.nextLine();
		System.out.println("indique su salario en bruto:");
		salarioBr = entradaTeclado.nextDouble();
		System.out.println("indique cuantos años lleva trabajando en la empresa:");
		anosTrabajados = entradaTeclado.nextInt();
		salarioNeto = salarioBr-(salarioBr*15/100);
		aumentoSalario = anosTrabajados*2;
		salarioTotal = salarioNeto+(salarioNeto*aumentoSalario/100);
		
		System.out.println("Estimad@ "+nombre+" "+apellidos+", su salario bruto es "+salarioBr+", teniendo en cuenta un IRRF del 15% su salario neto es "+salarioNeto+".");
		System.out.println("Devido a sus "+anosTrabajados+" años trabajando en la empresa su salario se incrementara en un 2% por cada año, El aumento es de "+aumentoSalario+"% y el salario total es "+salarioTotal);
		entradaTeclado.close();
	}
}


