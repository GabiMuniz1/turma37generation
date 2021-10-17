package app;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguiça;

public class Bichos {
public static void main(String[] args) {
		
		
		Cachorro dog1 = new Cachorro("Duke",1);
		Cavalo house1 = new Cavalo("Trovão",4);
		Preguiça preg1 = new Preguiça("EdNeide",50);
		
		System.out.println(dog1.getNome());
		dog1.correr();
		dog1.emitirSom();
		dog1.abanandoRabo();
		System.out.println(house1.getNome());
		house1.emitirSom();
		System.out.println(preg1.getNome());
		preg1.correr();
		

	}

}