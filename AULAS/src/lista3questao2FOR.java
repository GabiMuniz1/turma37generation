import java.util.Scanner;

public class lista3questao2FOR {
	/*
	 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	 */
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		int par = 0, impar = 0;
		int cont = 0 ;
		
		for(int x = 0; x < 10.0; x++) {
			System.out.print("Digite uma sequencia de números: ");
			cont = leia.nextInt();
			
			cont = cont + 1;
			if(cont % 2 == 0) {
				par = par + 1;
			}else
				impar = impar + 1;
		}
		
		System.out.printf(impar+" números pares\n");
		System.out.printf(par+" número impares\n");
		

		
	}
}	