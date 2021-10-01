import java.util.Scanner;

public class LISTA1QUESTAO4 {

	public static void main(String[] args) {
		int a, b, c;
		double R, S, D;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o primeiro valor: ");
		a = leia.nextInt();
		
		System.out.println("Entre com o segundo valor: ");
		b = leia.nextInt();
		
		System.out.println("Entre com o terceiro valor: ");
		c = leia.nextInt();
		R = (a+b)^2;
		S = ((b+c)^2);
		D = (R+S)/2;
		
		System.out.println("O resultado do cálculo é: "+D);
				
	}
	

}
