package Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		double mediaUp;
		double mediaDow;
		System.out.println("nota de la primera asignatura");
		nota1 = entradaTeclado.nextDouble();
		System.out.println("nota de la segunda asignatura");
		nota2 = entradaTeclado.nextDouble();
		System.out.println("nota de la tercera asignatura");
		nota3 = entradaTeclado.nextDouble();
		System.out.println("nota de la cuarta asignatura");
		nota4 = entradaTeclado.nextDouble();

		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("la nota media es:"+media);
		mediaUp = (double)Math.ceil(media);
		System.out.println("la nota media redondeada hacia arriba es:"+mediaUp);
		mediaDow = (double)Math.floor(media);
		System.out.println("la nota media truncada es:"+mediaDow);
		
		if (media>=8){
			System.out.println("¡Usted puede acceder a estudios superiores!");
			
		}
		else {
			System.out.println("La nota obtenida no es suficiente para acceder a los estudios que deseaba");
		}
		
		entradaTeclado.close();
	}

}
