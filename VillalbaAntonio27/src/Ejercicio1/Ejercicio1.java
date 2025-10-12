package Ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
	
public static void main (String args[])
{
	Scanner entradaTeclado = new Scanner(System.in);
	String nombre;
	String apellidos;
	int edad;
	double salario;
	int anosExp;
	int numProyectos;
	
	
	System.out.println("¿cual es tu nombre?");
	nombre = entradaTeclado.nextLine();
	System.out.println("¿cuales son tus apellidos?");
	apellidos = entradaTeclado.nextLine();
	System.out.println("¿cual es tu edad?");
	edad = entradaTeclado.nextInt();
	System.out.println("¿cuanto deseas cobrar?");
	salario = entradaTeclado.nextDouble();
	
	if(salario>30000 || edad>45) {
	
		System.out.println("Lo sentimos pero no cumple con nuestro perfil");
			
	}
			
		
	else {
			System.out.println("¿cuantos años de experiencia tiene?");
			anosExp = entradaTeclado.nextInt();
			System.out.println("¿en cuantos proyectos ha trabajado?");
			numProyectos = entradaTeclado.nextInt();
			
			if(anosExp>2 && numProyectos>3) {
				System.out.println("Enorabuena. ha sido contratado");
			}
			else {
				System.out.println("Lo sentimos pero no cumple con nuestro perfil");
			}
	}
	
	
	entradaTeclado.close();
	
}
}
