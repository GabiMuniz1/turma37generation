import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class lista2questao1 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, maior;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = scan.nextInt();
		System.out.print("Digite o terceiro valor: ");
		num3 = scan.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			maior = num1;
			System.out.println("O maior número é o primeiro, com o valor de " + maior);
		}
		if (num2 >= num1 && num2 >= num3) {
			maior = num2;
			System.out.println("O maior número é o segundo, com o valor de " + maior);
		}
		if (num3 >= num1 && num3 >= num2) {
			maior = num3;
			System.out.println("O maior número é o terceiro, com o valor de " + maior);
		}

	}

}
