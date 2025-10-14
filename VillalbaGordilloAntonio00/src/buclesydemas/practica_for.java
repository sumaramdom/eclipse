package buclesydemas;
//programa que pilla un inicio y un fin y solo muestra los multiplos de 3
import java.util.Scanner;

public class practica_for {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int inicio, fin;
		
		System.out.println("indique el primer numero");
		inicio = entradaTeclado.nextInt();
		System.out.println("indique el ultimo numero");
		fin = entradaTeclado.nextInt();
		
		for (int contador=inicio;contador<=fin;contador++) {
			if (contador%3==0/*esto se usa para sacar un resto*/) {
				System.out.println(contador+" es multiplo de 3");
			}
			else {}
		}
			
		
		entradaTeclado.close();
		
	}
}
