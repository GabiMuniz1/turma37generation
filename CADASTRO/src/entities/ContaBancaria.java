package entities;

public class ContaBancaria {

	//Atributos
	
	public String titular;
	public String cpf;
	public double saldo;
	public double credito;
	
	//M�todos
	
	public void exibirExtrato() {
		System.out.println("TITULAR\t\tCPF\tSALDO\tCR�DITO");
		System.out.println("\n"+ titular + "\t" + cpf + "\t" + saldo + "\t" + credito);
	}
}