package app;

public class ContaBancaria {

	private String titular;
	private String cpf;
	private double saldo;
	private double credito;

	public static void main(String[] args) {

		//objetos
		ContaBancaria exemplo6 = new ContaBancaria();

		//ENTRADAS
		exemplo6.titular = "Lauro";
		exemplo6.cpf = "000.000.000-00";
		exemplo6.saldo = 1200.00;
		exemplo6.credito = 5000.00;

		//SAIDA
		exemplo6.exibirExtrato();

	}

	private void exibirExtrato() {
		// TODO Auto-generated method stub
		
	}

}