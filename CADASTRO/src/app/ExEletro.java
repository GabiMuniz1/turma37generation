package app;
import java.util.Scanner;

import entities.Clientes;
import entities.Eletronicos;

public class ExEletro {

	public static void main(String[] args) {
		//OBJETO
		Eletronicos elet1 = new Eletronicos ();
		Scanner leia = new Scanner(System.in);
		
		elet1.tipoPc = "Gamer";
		elet1.processadorPc = "Computador AMD Phenom";
		elet1.sistemaOperacional = "Windows, da Microsoft";
		elet1.memoriaRam = "8GB";
		elet1.hD = "1TB";
		
		elet1.tipoPc();
		elet1.exibirProcessadorPc();
		elet1.exibirSistemaOperacional();
		elet1.exibirMemoriaRam();
		elet1.exibirhD();
	}

}