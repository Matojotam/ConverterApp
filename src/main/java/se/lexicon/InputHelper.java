package se.lexicon;

import java.util.Scanner;

public class InputHelper {

    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            IO.print(prompt);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }

            IO.println("Invalid input. Please enter a whole number.");
            scanner.next();
        }
    }

    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            IO.print(prompt);

            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }

            IO.println("Invalid input. Please enter a number.");
            scanner.next();
        }
    }
}
