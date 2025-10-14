package confiadeverdad;

import java.util.Scanner;

public class ejercicioswitch {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int preguntasRespondidas;
		int preguntasFalladas;
		double notaTotal;
		double notaArreglada;
		int notaFinal;
		
		
		System.out.println("¿cuantas ha respondido?");
		preguntasRespondidas = entradaTeclado.nextInt();
		
		if(preguntasRespondidas<=20) {
		
			System.out.println("¿cuantas ha fallado?");
			preguntasFalladas = entradaTeclado.nextInt();
			
			if(preguntasFalladas<=preguntasRespondidas) {
				
			
				
				notaTotal = preguntasRespondidas - preguntasFalladas *1.5; 
				
				if(notaTotal<0) {
					notaTotal = 0;
				}
				else {}
				
				System.out.println("la nota total es: "+ notaTotal +"/20");
				notaArreglada = notaTotal / 2;
				System.out.println("o : "+ notaArreglada +"/10");
				notaFinal = (int)Math.floor(notaArreglada);
				switch (notaFinal) {
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
						System.out.println("error en la nota");
						break;
				}
					
				
			}
			
			else {
				System.out.println("el numero no puede ser mayor que las preguntas respondidas");
			}
		}
		else {
				System.out.println("el numero no puede ser mayor de 20");
				
				
			}
		
		entradaTeclado.close();
		
	}



}
