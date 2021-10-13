package entities;

public class Preguiça extends Animal {

	public Preguiça(String nome, int idade) {
		super(nome, idade);

	}

	public void subirArvore() {

		System.out.println("Subindo arvore...");
	}

	@Override
	public void correr() {
		System.out.println("Correndo bem devagar...");
	}
}