package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Console;

public class Test {

	public static void main(String[] args) {
		
		Console c1 = new Console("Nintendo Switch");
		Console c2 = new Console("Nintendo DS");
		Console c3 = new Console("Nintendo Wii");
		Console c4 = new Console("Nintendo Gameboy");
		Console c5 = new Console("Nintendo GameCube");
		Adresse a1 = new Adresse("7","Rue de Mounir","New York");
		Boutique b1 = new Boutique("Micromania",a1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		

	}

}
