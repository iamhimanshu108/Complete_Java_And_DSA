package JavaBroCode.Day04MADLIBS;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // MAD LIBS Game

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enetr a Adjective");
        adjective1 = scanner.nextLine();
        System.out.println("Eneter A Noun");
        noun1 = scanner.nextLine();
        System.out.println("Enter a Verb");
        adjective2= scanner.nextLine();
        System.out.println("Enetr a verb end with -ing ");
        verb1 = scanner.nextLine();
        System.out.println("Enter a adjective ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a  "+ adjective1 + "zoo.");
        System.out.println("In an exhibit, i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " +adjective2+ "and "+ verb1+ "!");
        System.out.println("I was "+ adjective3 + "!");

        scanner.close();
    }
}
