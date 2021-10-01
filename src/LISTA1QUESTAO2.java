import java.util.Scanner;

public class LISTA1QUESTAO2 {
	
	public static void main(String args[]) {
		int ano;
		int mes;
		int dia;
		int dias;
		
		Scanner leia =  new Scanner(System.in);
		System.out.println("Digite a idade em dias: ");
		dias = leia.nextInt();
		ano = (dias/365);
		mes = (dias%365)/30;
		dia = (dias%365)%30;
		System.out.println("Sua final é "+ ano +" anos,"+ mes +"meses e"+dia+"dias.");
		
	}

}
