package app;


import java.util.Scanner;

import entities.Clientes;

public class ExCliente {

	public static void main(String[] args) {
		
		//OBJETO
		Clientes exemplo1 = new Clientes();
		Scanner leia = new Scanner(System.in);
		
		//ENTRADAS
		exemplo1.nome = "Marilia";
		exemplo1.anoNascimento = 2001;
		exemplo1.cpf = 123456789;
		exemplo1.contato = 981298122;
		
		//SAIDA
		exemplo1.exibirNome();
		exemplo1.exibirIdade();
		exemplo1.exibirCpf();
		exemplo1.exibirContato();
		
		//ENTRADA E SA�DAS
		System.out.println("O cliente pagara como? digite 'D' para d�bito, para cr�dito 'C' ou 'E' para esp�cie: ");
		exemplo1.formaPagamento = leia.next().toUpperCase().charAt(0);
		exemplo1.exibirPagamento();		
		
		

	}

}