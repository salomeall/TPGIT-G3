package nintendo.test;

import nintendo.model.Client;
import nintendo.model.Console;

public class Test {

	public static void main(String[] args) {
		
		Console c1 = new Console("Nintendo Switch");
		Console c2 = new Console("Nintendo DS");
		Console c3 = new Console("Nintendo Wii");
		Console c4 = new Console("Nintendo Gameboy");
		Console c5 = new Console("Nintendo GameCube");
		
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
