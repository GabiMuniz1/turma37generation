import java.util.Scanner;

public class lista3questao5DOWHILE {

	/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual
	 * a zero. No final, mostre a soma dos n�meros digitados.
	 * 
	 */

	public static void main(String[] args) {
		int num, soma = 0;
		Scanner leia = new Scanner(System.in);	
		
		System.out.print("Digite os n�meros que queira somar ou");
		System.out.print(" digite 0 para finalizar o programa:");
		
			do {
				num = leia.nextInt();
				soma = soma + num;
			}while(num!=0);
		System.out.print("A soma total dos n�meros digitados �: "+soma);
	}

}
