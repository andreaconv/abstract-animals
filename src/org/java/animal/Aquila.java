package org.java.animal;

import org.java.animal.abs.Animale;

public class Aquila extends Animale {

	public Aquila(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.println("SKREE");
	}

	@Override
	public void mangia() {
		System.out.println("carne");
	}

}
