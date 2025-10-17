package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int cantidad0=0;
		double numPos=0;
		int contPos=0;
		double numNeg=0;
		int contNeg=0;
		int ram;
		
		for (int contador=1;contador<=10;contador++) {
			System.out.println("indique numero "+contador);
			ram = entradaTeclado.nextInt();
			if (ram==0) {
				cantidad0++;
			}
			else if(ram<0) {
				numNeg=numNeg+ram;
				contNeg++;
			}
			else {
				numPos=numPos+ram;
				contPos++;
			}
			
			
		}
		if (contPos!=0) {
			System.out.println("media de numeros positivos: "+(numPos/contPos));
		}
		else {
			System.out.println("media de numeros positivos: 0");
		}
		//esto lo hago porque es posible que no halla ningun numero positivo, lo mismo con el negativo
		if (contNeg!=0) {
			System.out.println("media de numeros negativos: "+(numNeg/contNeg));
		}
		else {
			System.out.println("media de numeros negativos: 0");
		}
		
		System.out.println("cantidad de ceros: "+cantidad0);

		
		
		
		
		entradaTeclado.close();
		
	}
}
