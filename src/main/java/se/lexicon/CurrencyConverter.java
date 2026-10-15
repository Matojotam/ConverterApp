package se.lexicon;

import java.util.Scanner;

public class CurrencyConverter {

    private static final double SEK_TO_EUR = 0.088;
    private static final double SEK_TO_USD = 0.095;
    private static final double EUR_TO_USD = 1.08;

    public static void convert(Scanner scanner) {

        IO.println("==================================");
        IO.println("       CURRENCY CONVERTER");
        IO.println("==================================");
        IO.println("1. SEK to EUR");
        IO.println("2. EUR to SEK");
        IO.println("3. SEK to USD");
        IO.println("4. USD to SEK");
        IO.println("5. EUR to USD");
        IO.println("6. USD to EUR");
        IO.println("==================================");

        int choice = InputHelper.readInt(scanner, "Choose an option: ");

        if (choice < 1 || choice > 6) {
            IO.println("Invalid option.");
            return;
        }
        double amount = InputHelper.readDouble(scanner, "Enter amount: ");

        double result;


        switch (choice) {

            case 1: {
                result = sekToEur(amount);

                String conversion = String.format(
                        "%.2f SEK = %.2f EUR", amount, result);

                String timestamp = DateTimeHelper.getCurrentDateTime();

                IO.println("Result: " + conversion);
                IO.println("Converted at: " + timestamp);

                ConversionHistory.add(conversion + " | " + timestamp);
                break;
            }

            case 2: {
                result = eurToSek(amount);

                String conversion = String.format(
                        "%.2f EUR = %.2f SEK", amount, result);

                String timestamp = DateTimeHelper.getCurrentDateTime();

                IO.println("Result: " + conversion);
                IO.println("Converted at: " + timestamp);

                ConversionHistory.add(conversion + " | " + timestamp);
                break;
            }

            case 3: {
                result = sekToUsd(amount);

                String conversion = String.format(
                        "%.2f SEK = %.2f USD", amount, result);

                String timestamp = DateTimeHelper.getCurrentDateTime();

                IO.println("Result: " + conversion);
                IO.println("Converted at: " + timestamp);

                ConversionHistory.add(conversion + " | " + timestamp);
                break;
            }

            case 4: {
                result = usdToSek(amount);

                String conversion = String.format(
                        "%.2f USD = %.2f SEK", amount, result);

                String timestamp = DateTimeHelper.getCurrentDateTime();

                IO.println("Result: " + conversion);
                IO.println("Converted at: " + timestamp);

                ConversionHistory.add(conversion + " | " + timestamp);
                break;
            }

            case 5: {
                result = eurToUsd(amount);

                String conversion = String.format(
                        "%.2f EUR = %.2f USD", amount, result);

                String timestamp = DateTimeHelper.getCurrentDateTime();

                IO.println("Result: " + conversion);
                IO.println("Converted at: " + timestamp);

                ConversionHistory.add(conversion + " | " + timestamp);
                break;
            }

            case 6: {
                result = usdToEur(amount);

                String conversion = String.format(
                        "%.2f USD = %.2f EUR", amount, result);

                String timestamp = DateTimeHelper.getCurrentDateTime();

                IO.println("Result: " + conversion);
                IO.println("Converted at: " + timestamp);

                ConversionHistory.add(conversion + " | " + timestamp);
                break;
            }

            default:
                IO.println("Invalid option.");
        }

    }

    public static double sekToEur(double sek) {
        return sek * SEK_TO_EUR;
}
    public static double eurToSek(double eur) {
        return eur / SEK_TO_EUR;
    }

    public static double sekToUsd(double sek) {
        return sek * SEK_TO_USD;
    }

    public static double usdToSek(double usd) {
        return usd / SEK_TO_USD;
    }

    public static double eurToUsd(double eur) {
        return eur * EUR_TO_USD;
    }

    public static double usdToEur(double usd) {
        return usd / EUR_TO_USD;
    }
}





