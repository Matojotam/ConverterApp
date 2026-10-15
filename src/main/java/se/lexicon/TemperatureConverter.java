package se.lexicon;

import java.util.Scanner;

public class TemperatureConverter {


    private static final double FAHRENHEIT_OFFSET = 32.0;
    private static final double CELSIUS_FACTOR = 9.00 / 5.0;
    private static final double FAHRENHEIT_FACTOR = 5.0 / 9.0;

    public static void convert(Scanner scanner) {

        IO.println("==================================");
        IO.println("      TEMPERATURE CONVERTER");
        IO.println("==================================");
        IO.println("1. Celsius to Fahrenheit");
        IO.println("2. Fahrenheit to Celsius");
        IO.println("==================================");


        int choice = InputHelper.readInt(scanner, "Choose an option: ");

        if (choice == 1) {
            double celsius = InputHelper.readDouble(
                    scanner, "Enter temperature in Celsius: ");

            double fahrenheit = celsiusToFahrenheit(celsius);

            IO.println(String.format("%.2f C = %.2f F",
                    celsius, fahrenheit));

            ConversionHistory.add(String.format("%.2f C = %.2f F",
                    celsius, fahrenheit));
        } else if (choice == 2) {

            double fahrenheit = InputHelper.readDouble(
                    scanner, "Enter temperature in Fahrenheit: ");

            double celsius = fahrenheitToCelsius(fahrenheit);

            IO.println(String.format("%.2f F = %.2f C",
                    fahrenheit, celsius));

            ConversionHistory.add(String.format("%.2f F = %.2f C",
                    fahrenheit, celsius));
        } else {
            IO.println("Invalid option.");
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
            return celsius * CELSIUS_FACTOR + FAHRENHEIT_OFFSET;
        }
    public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - FAHRENHEIT_OFFSET) * FAHRENHEIT_FACTOR;
        }

}

