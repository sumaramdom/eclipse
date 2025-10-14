package confiadeverdad;

import java.util.Scanner;

public class confiadeverdad1 {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int suma;
		int numerActual;
		int paso;
		suma = 0;
		paso=0;
		numerActual = 1;
		while (numerActual != 0 && paso <8) {
			paso++;
			System.out.println("indique el numero " + paso);
			numerActual = entradaTeclado.nextInt();
			suma = suma+numerActual;
			
		}
				
		System.out.println("el total es: "+ suma);
			
		
		entradaTeclado.close();
		
	}



}
