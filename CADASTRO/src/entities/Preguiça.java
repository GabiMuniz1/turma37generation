package entities;

public class Pregui�a extends Animal {

	public Pregui�a(String nome, int idade) {
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