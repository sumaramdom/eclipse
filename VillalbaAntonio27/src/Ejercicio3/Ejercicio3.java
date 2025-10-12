package Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		int nota;
		System.out.println("¿cual es su nota?");
		nota = entradaTeclado.nextInt();
		switch (nota) {
		case 0,1,2,3,4:
			
			System.out.println("esta suspenso"); 
		break;
		case 5,6:
			System.out.println("esta bien");
		break;
		case 7,8:
			System.out.println("esta notable");
		break;
		case 9,10:
			System.out.println("esta sobresaliente");
		break;
		default:
			System.out.println("la nota introducida es incorrecta");
			break;

		}
		entradaTeclado.close();
	}

}
