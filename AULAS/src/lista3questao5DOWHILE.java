import java.util.Scanner;

public class lista3questao5DOWHILE {

	/*Crie um programa que leia um número do teclado até que encontre um número igual
	 * a zero. No final, mostre a soma dos números digitados.
	 * 
	 */

	public static void main(String[] args) {
		int num, soma = 0;
		Scanner leia = new Scanner(System.in);	
		
		System.out.print("Digite os números que queira somar ou");
		System.out.print(" digite 0 para finalizar o programa:");
		
			do {
				num = leia.nextInt();
				soma = soma + num;
			}while(num!=0);
		System.out.print("A soma total dos números digitados é: "+soma);
	}

}
