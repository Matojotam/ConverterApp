package se.lexicon;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {

            IO.println("==================================");
            IO.println("      LEXICON CONVERTER APP");
            IO.println("==================================");
            IO.println("1. Temperature Converter");
            IO.println("2. Currency Converter");
            IO.println("3. BMI Calculator");
            IO.println("4. Exit");
            IO.println("==================================");


            int choice = InputHelper.readInt(scanner, "Choose an option: ");

            switch (choice) {
                case 1:
                    TemperatureConverter.convert(scanner);
                    break;
                case 2:
                    CurrencyConverter.convert(scanner);
                    break;
                case 3:
                    BMICalculator.convert(scanner);
                    break;
                case 4:
                    ConversionHistory.showHistory();
                    running = false;
                    break;
                default:
                    IO.println("Invalid option.");
            }


        }
    }
}