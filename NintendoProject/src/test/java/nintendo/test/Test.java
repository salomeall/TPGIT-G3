package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;

public class Test {

	public static void main(String[] args) {
		
		Console c1 = new Console("Nintendo Switch",34.45,"12/12/2020");
		Console c2 = new Console("Nintendo DS",39.45,"12/12/2007");
		Console c3 = new Console("Nintendo Wii",64.45,"12/12/2003");
		Console c4 = new Console("Nintendo Gameboy",56.45,"12/12/1980");
		Console c5 = new Console("Nintendo GameCube",14.45,"12/12/1920");
		Adresse a1 = new Adresse("7","Rue de Mounir","New York");
		Boutique b1 = new Boutique("Micromania",a1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		Client cl1 = new Client("Sanches", "Viviana");
		Client cl2 = new Client("Allali", "Salome");
		System.out.println(cl1);
		System.out.println(cl2);
	}

}
