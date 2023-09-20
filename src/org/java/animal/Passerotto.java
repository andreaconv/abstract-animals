package org.java.animal;

import org.java.animal.abs.Animale;
import org.java.animal.inter.Volante;

public class Passerotto extends Animale implements Volante{

	public Passerotto(String nome) {
		super(nome);
	}

	public void vola() {
		System.out.println("Sto volando!!!");
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
