import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class lista2questao4 {

	//Faça um programa em que permita a entrada de um número qualquer e exiba se este
	//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	//ímpar exiba o número elevado ao quadrado.
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double num = 0.0;
		double res = 0.0;
		
		System.out.println("Digite um número decimal: ");
		num = leia.nextDouble();
		
		res = num%2.0;
		if(res == 0.0 ){
			System.out.println("como o número é"+num+ " , elevamos ele ao quadrado: "+ num * num);
		}
		
		else {
			System.out.println("como o número"+num+"é impar, fizemos a raiz quadrada: "+ Math.sqrt(num));
		}
				
	}

}
