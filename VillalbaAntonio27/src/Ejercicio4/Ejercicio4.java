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
		nota1 = entradaTeclado.nextInt();
		System.out.println("nota de la segunda asignatura");
		nota2 = entradaTeclado.nextInt();
		System.out.println("nota de la tercera asignatura");
		nota3 = entradaTeclado.nextInt();
		System.out.println("nota de la cuarta asignatura");
		nota4 = entradaTeclado.nextInt();

		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("la nota media es:"+media);
		mediaUp = (double)Math.ceil(media);
		System.out.println("la nota media redondeada hacia arriba es:"+mediaUp);
		mediaDow = (double)Math.floor(media);
		System.out.println("la nota media truncada es:"+mediaDow);
		
		if (media>=8){
			//me he quedado aqui
		}
		
		entradaTeclado.close();
	}

}
