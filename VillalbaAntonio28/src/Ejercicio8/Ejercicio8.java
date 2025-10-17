package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		String nombre;
		String apellidos;
		int edad;
		int numRutas;
		double distanciaRuta;
		double distanciaRutaLarga=0;
		int nParticipantes;
		String ciudadLarga="";
		String ciudad="";
		double sumaDistancia=0;
		
		
		System.out.println("indique su nombre");
		nombre = entradaTeclado.nextLine();
		System.out.println("indique sus apellidos");
		apellidos = entradaTeclado.nextLine();
		do {
			System.out.println("indique su edad");
			edad = entradaTeclado.nextInt();
			if(edad<17 ||edad>45){
				System.out.println("esa edad no es correcta");
			}
		}while(edad<17 ||edad>45);
		System.out.println("indique el numero de rutas realizadas");
		numRutas = entradaTeclado.nextInt();
		System.out.println("indique la distancia de la ultima ruta");
		distanciaRuta = entradaTeclado.nextDouble();
		
		
		System.out.println("ahora va a indicar los datos de las ultimas 5 caminatas");
		for (int contador =0;contador <=5; contador++) {
			System.out.println("indique la ciudad numero "+contador);
			entradaTeclado.nextLine();
			ciudad = entradaTeclado.nextLine();
			System.out.println("indique la distancia recorrida");
			distanciaRuta = entradaTeclado.nextDouble();
			sumaDistancia=sumaDistancia+distanciaRuta;
			System.out.println("indique el numero de participantes");
			nParticipantes = entradaTeclado.nextInt();
			if(distanciaRuta>distanciaRutaLarga) {
				distanciaRutaLarga=distanciaRuta;
				ciudadLarga=ciudad;
			}
		}
		System.out.println("Nombre: "+nombre+" "+apellidos);
		System.out.println("Edad: "+edad);
		System.out.println("Numero de rutas realizadas:"+numRutas);
		System.out.println(" ");
		System.out.println("Distancia media (ultimas 5 ruatas): "+(sumaDistancia/5));
		System.out.println("Distancia mas larga de las ultimas 5 rutas:"+distanciaRutaLarga);
		System.out.println("Ciudad de la ruta mas larga:"+ ciudadLarga);
		
		
		
		entradaTeclado.close();
	}

	
	
	
}
