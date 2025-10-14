package buclesydemas;

import java.util.Scanner;

public class bucle_for {
	public static void main (String args[])
	//for se ejecuta x numero de veces que ya sabemos de antemano, NO TOCAR LA VARIABLE DEL FOR DENTRO DEL FOR
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int contador, tablaDel;

		
		System.out.println("indique el numero del que quieres la tabla");
		tablaDel = entradaTeclado.nextInt();
		
		for ( contador =1/*aqui se crea un contador y le ponemos un numero, a poder ser un int (ademas podemos inicializarlo ahi mismo)*/;contador <=10/*aqui decimos hasta donde deve llegar la variable del for*/; contador++/*ya por ultimo lo que hace que sume el contador del for*/) {
			System.out.println(tablaDel*contador);
		}
		//detalle a tener en cuenta es que por culpa del "contador++" del for, al terminar el for este se suma una ultima vez
		
		
		entradaTeclado.close();
		
	}
}
