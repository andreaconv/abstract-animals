package org.java.animal;

import org.java.animal.abs.Animale;
import org.java.animal.inter.Nuotante;

public class Delfino extends Animale implements Nuotante{

	public Delfino(String nome) {
		super(nome);
	}
	
	public void nuota() {
		System.out.println("Sto nuotando!!!");
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
