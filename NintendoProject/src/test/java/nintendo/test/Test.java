package nintendo.test;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;

import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		
		Hybride c1 = new Hybride ("Nintendo Switch",34.45,"12/12/2020");
		Portable c2 = new Portable("Nintendo DS",39.45,"12/12/2007");
		Salon c3 = new Salon("Nintendo Wii",64.45,"12/12/2003");
		Portable c4 = new Portable("Nintendo Gameboy",56.45,"12/12/1980");
		Salon c5 = new Salon("Nintendo GameCube",14.45,"12/12/1920");
		Adresse a1 = new Adresse("7","Rue de Mounir","New York");
		Boutique b1 = new Boutique("Micromania",a1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		Jeu j1 = new Jeu("Zelda", c1, b1);
        Jeu j2 = new Jeu("Super Mario", c2, b1);
        Jeu j3 = new Jeu("Animal Crossing", c1, b1);

        Achat ach1 = new Achat(j1, "2025-10-01", 59.99);
        Achat ach2 = new Achat(j2, "2025-10-05", 49.99);
        Achat ach3 = new Achat(j3, "2025-10-07", 59.99);
       
		Client cl1 = new Client("Sanches", "Viviana");
		Client cl2 = new Client("Allali", "Salome");
		
		cl1.ajouterAchat(ach1);
		cl1.ajouterAchat(ach2);
		cl2.ajouterAchat(ach3);
		
		System.out.println(cl1);
		System.out.println(cl2);
	}

}
