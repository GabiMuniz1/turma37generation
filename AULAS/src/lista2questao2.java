import java.util.Scanner;

public class lista2questao2 {

	// Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, cres;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = scan.nextInt();
		System.out.print("Digite o terceiro valor: ");
		num3 = scan.nextInt();

		if (num2>num1) {
			cres = num1;
			num1 = num2;
			num2 = cres;
		}
		if (num3>num1) {
			cres = num1;
			num1 = num3;
			num3 = cres;
		}
		if (num3>num2) {
			cres = num2;
			num2 = num3;
			num3 = cres;
		}
		System.out.println(num1+" >= "+num2+" >= "+num3);
	}
}
