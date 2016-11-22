package de.johannes;
public class App {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Zeichenkette eingeben:");
			System.out.println(new java.util.Scanner(System.in).nextLine().toUpperCase());
		} else {
			for (String s : args) {
				System.out.print(s.toUpperCase() + " ");
			}
			System.out.println();
		}
	}
	
}
