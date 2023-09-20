package org.java;

import org.java.animal.Aquila;
import org.java.animal.Cane;
import org.java.animal.Delfino;
import org.java.animal.Passerotto;
import org.java.animal.abs.Animale;
import org.java.animal.inter.Volante;
import org.java.animal.inter.Nuotante;

public class Main {
	
	public static void faiVolare(Volante animale) {
		animale.vola();		
	}
	public static void faiNuotare(Nuotante animale) {
		animale.nuota();
	}
	
	public static void main(String[] args) {

		
		Animale[] animals = new Animale[4];
		
		animals[0] = new Cane("Cane");
		animals[1] = new Passerotto("Passerotto");
		animals[2] = new Aquila("Aquila");
		animals[3] = new Delfino("Delfino");
		
		for (int i = 0; i < animals.length; i++) {
			
			
			System.out.println("L'animale: " + animals[i].getNome());
			System.out.print("Dorme: ");
			animals[i].dormi();
			System.out.print("Il suo verso è: ");
			animals[i].verso();
			System.out.print("Mangia: ");
			animals[i].mangia();
			
			if(animals[i] instanceof Volante) {
				faiVolare((Volante) animals[i]);
			}
			
			if(animals[i] instanceof Nuotante) {
				faiNuotare((Nuotante) animals[i]);
			}
			
			
			System.out.println("\n------------------\n");
			
		}

		
	}

}
