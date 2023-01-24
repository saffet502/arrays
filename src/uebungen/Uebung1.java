package uebungen;

import java.util.Arrays;

public class Uebung1 {

	public static void main(String[] args) {
		
		String wochenTag [] = new String[7];
		wochenTag[0] = "Montag";
		wochenTag[1] = "Dienstag";
		wochenTag[2] = "Mittwoch";
		wochenTag[3] = "Donerstag";
		wochenTag[4] = "Freitag";
		wochenTag[5] = "Samstag";
		wochenTag[6] = "Sonntag";
		Arrays.sort(wochenTag);

		for (String tag : wochenTag) {
			System.out.println(tag);
		}
		
	}

}
