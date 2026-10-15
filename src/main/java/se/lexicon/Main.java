package se.lexicon;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("==================================");
            System.out.println("      LEXICON CONVERTER APP");
            System.out.println("==================================");
            System.out.println("1. Temperature Converter");
            System.out.println("2. Currency Converter");
            System.out.println("3. BMI Calculator");
            System.out.println("4. Exit");
            System.out.println("==================================");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // We will call the temperature method here
                    break;
                case 2:
                    // We will call the currency method here
                    break;
                case 3:
                    // We will call the BMI method here
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
        }



    }
}
