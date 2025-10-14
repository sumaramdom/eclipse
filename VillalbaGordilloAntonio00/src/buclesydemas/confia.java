package buclesydemas;



import java.util.Scanner;
//while se ejecuta 0 o mas veces, el dowhile almenos 1 ya que pasa por el medio las ejecuciones y luego vuelve arriba
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
