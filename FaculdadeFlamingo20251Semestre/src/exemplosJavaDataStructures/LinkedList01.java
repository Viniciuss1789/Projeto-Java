package exemplosJavaDataStructures;

import java.util.LinkedList;

public class LinkedList01 {
	
	public static void main(String[] args) {
		
		LinkedList<String> pokemon = new LinkedList<String>();
		
		pokemon.add("Pokemon Fire Red");
		pokemon.add("Pokemon Leaf Green");
		pokemon.add("Pokemon Ruby");
		pokemon.add("Pokemon Sapphira");
		pokemon.add("Pokemon Emerald");
		
		System.out.println(pokemon);
	}

}
