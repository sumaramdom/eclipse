package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int sumatotal=0;
		int ram=1;
		String superiores="";
		double media;
		int pasos =0;
		int numValid=0;
		
		while (ram != 0) {
			System.out.println("indique numero "+(pasos+1));
			//se le suma uno porque sino empezaria como paso numero 0
			ram = entradaTeclado.nextInt();
			pasos++;
			
			if (ram >0) {
				sumatotal = sumatotal+ram;
				superiores = superiores + ram + " ";
				numValid++;
			}
			else {}
		}
		System.out.println("numeros superiores a 0:");
		System.out.println(superiores);
		media = sumatotal/numValid;
		System.out.println("la media de los mismos es: "+media);
		
		entradaTeclado.close();
		
	}
}
