package org.java.animal;

import org.java.animal.abs.Animale;
import org.java.animal.inter.Nuotante;

public class Cane extends Animale implements Nuotante{

	public Cane(String nome) {
		super(nome);
	}
	
	public void nuota() {
		System.out.println("Sto nuotando!!!");
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
