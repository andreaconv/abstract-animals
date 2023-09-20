package org.java.animal;

import org.java.animal.abs.Animale;

public class Passerotto extends Animale{

	public Passerotto(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.println("CIP");
	}

	@Override
	public void mangia() {
		System.out.println("semi");
	}

}
