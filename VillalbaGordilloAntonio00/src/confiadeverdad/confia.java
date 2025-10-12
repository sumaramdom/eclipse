package confiadeverdad;



import java.util.Scanner;

public class confia {
	public static void main (String args[])
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int inicio;
		int fin;
		int numeroActual;
		String letra;
		letra = "";
		
		System.out.println("indique el primer numero");
		inicio = entradaTeclado.nextInt();
		System.out.println("indique el ultimo numero");
		fin = entradaTeclado.nextInt();
		
		if (inicio<fin) {
		
			numeroActual = inicio;
			while (numeroActual != fin+1) {
				
				letra = letra +" "+ numeroActual;
				numeroActual++;
				
				
			}
		}
		
		else if (fin<inicio){
			numeroActual = fin;
			while (numeroActual != inicio+1) {
				
				letra = letra +" "+ numeroActual;
				numeroActual++;
				
			}
		}
		else {
			
			letra = letra+inicio;
		}
		
		System.out.println("numeros del "+ inicio +" al "+ fin);
		System.out.println(letra);
			
		
		entradaTeclado.close();
		
	}



}
