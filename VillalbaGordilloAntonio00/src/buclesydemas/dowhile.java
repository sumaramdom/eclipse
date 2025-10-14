package buclesydemas;



import java.util.Scanner;

public class dowhile {
	public static void main (String args[])
	//while se ejecuta 0 o mas veces, el dowhile almenos 1 ya que pasa por el medio las ejecuciones y luego vuelve arriba
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int inicio;
		int fin;
		int numeroActual;
		String letra = ""; /*esto se hace para inicializarlo ya que de normal seria un valor nulo*/

		
		System.out.println("indique el primer numero");
		inicio = entradaTeclado.nextInt();
		System.out.println("indique el ultimo numero");
		fin = entradaTeclado.nextInt();
		
		if (inicio<fin) {
		
			numeroActual = inicio;
			do {
				letra = letra +" "+ numeroActual;
				numeroActual++;
			}while (numeroActual != fin+1) ;//se le suma uno ya que al dar el resultado lo lee antes de que llege al numero que deve llegar

				
				
				
				
			
		}
		
		else if (fin<inicio){
			numeroActual = fin;
			do {
				letra = letra +" "+ numeroActual;
				numeroActual++;
			}
			while (numeroActual != inicio+1);//se le suma uno ya que al dar el resultado lo lee antes de que llege al numero que deve llegar
				
			
				
			
		}
		else {
			
			letra = letra+inicio;
		}
		
		System.out.println("numeros del "+ inicio +" al "+ fin);
		System.out.println(letra);
			
		
		entradaTeclado.close();
		
	}



}
