package org.java.animal;

import org.java.animal.abs.Animale;

public class Cane extends Animale{

	public Cane(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.print("BAU\n");
	}

	@Override
	public void mangia() {
		System.out.print("crocchette\n");
	}

	
}
