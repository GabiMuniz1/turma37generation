import java.util.Scanner;

public class LISTA1QUESTAO1 {

	public static void main(String[] args) {
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
		int diasAno = 365;
		int diaMes = 30;
		int dia;
		int mes;
		int ano;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("DIGITE A IDADE :" );
		ano = leia.nextInt();
		
		System.out.println("DIGITE O MÊS :" );
		mes = leia.nextInt();
		
		System.out.println("DIGITE O ANO :" );
		dia = leia.nextInt();
		
		dia = (ano * diasAno) +(mes * diaMes);
		System.out.println("A sua idade em dias é:"+ dia );
		
	}
}
