package org.java.animal;

import org.java.animal.abs.Animale;

public class Delfino extends Animale {

	public Delfino(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.println("EEK EEK");
	}

	@Override
	public void mangia() {
		System.out.println("pesce");
	}

}
