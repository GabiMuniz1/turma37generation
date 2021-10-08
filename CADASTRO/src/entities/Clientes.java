package entities;

public class Clientes {
	
	//Atributos
	
	public String nome;
	public int anoNascimento;
	public int cpf;
	public double contato;
	public char formaPagamento;
	
	
	//M�todos
	
	public void exibirNome() {
		
		System.out.println("O nome �: "+ nome);
	}
	public void exibirIdade() {
		
		System.out.println("A idade �: "+(2021-anoNascimento));
	}
	public void exibirCpf() {
		
		System.out.println("O CPF (somente n�meros) �: "+cpf);
	}
	public void exibirContato() {
		
		System.out.println("O n�mero de contato �: "+contato);
	}
	public void exibirPagamento( ) {
		
		if (formaPagamento == 'D') {
			
			System.out.println("Cliente "+nome+",pagar� no d�bito");
			
		}
		else if (formaPagamento == 'C') {
			
			System.out.println("Cliente "+nome+",pagar� no cr�dito");
		}
		else {
			
			System.out.println("Cliente "+nome+",pagar� em esp�cie");
		}
	}
}