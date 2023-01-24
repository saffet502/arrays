package uebungen;

import java.util.*;
public class Uebung2 {
	public static void main(String[] args) {
		String[] validInputs = { "Banane", "Apfel", "Kirsche" };

		boolean found = false;

		while ( ! found ) {
		  System.out.println("Geben Sie bitte ein Frucht ein");
		  String input = new Scanner( System.in ).nextLine();

		  for ( String s : validInputs )

		    if ( s.equals( input ) ) {

		      found = true;

		      break;

		    }

		}

		System.out.println( "Gültiges Früchtchen eingegeben" );

	}
	
}
