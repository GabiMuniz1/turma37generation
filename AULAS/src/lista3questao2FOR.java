import java.util.Scanner;

public class lista3questao2FOR {
	/*
	 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	 */
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		int par = 0, impar = 0;
		int cont = 0 ;
		
		for(int x = 0; x < 10.0; x++) {
			System.out.print("Digite uma sequencia de n�meros: ");
			cont = leia.nextInt();
			
			cont = cont + 1;
			if(cont % 2 == 0) {
				par = par + 1;
			}else
				impar = impar + 1;
		}
		
		System.out.printf(impar+" n�meros pares\n");
		System.out.printf(par+" n�mero impares\n");
		

		
	}
}	