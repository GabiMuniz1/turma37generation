import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class lista2questao4 {

	//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	//�mpar exiba o n�mero elevado ao quadrado.
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double num = 0.0;
		double res = 0.0;
		
		System.out.println("Digite um n�mero decimal: ");
		num = leia.nextDouble();
		
		res = num%2.0;
		if(res == 0.0 ){
			System.out.println("como o n�mero �"+num+ " , elevamos ele ao quadrado: "+ num * num);
		}
		
		else {
			System.out.println("como o n�mero"+num+"� impar, fizemos a raiz quadrada: "+ Math.sqrt(num));
		}
				
	}

}
