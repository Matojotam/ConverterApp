package se.lexicon;

import java.util.Scanner;

public class BMICalculator {

    public static void convert(Scanner scanner) {
        IO.println("==================================");
        IO.println("          BMI CALCULATOR");
        IO.println("==================================");

        double weight = InputHelper.readDouble(
                scanner, "Enter your weight in kilograms: ");

        double height = InputHelper.readDouble(
                scanner, "Enter your height in metres: ");

        if (weight <= 0 || height <= 0) {
            IO.println("Weight and height must be greater than zero.");
            return;
        }
        double bmi = calculateBMI(weight, height);
        String category = getBMICategory(bmi);

        IO.println("----------------------------------");
        IO.println(String.format("Your BMI: %.2f", bmi));
        IO.println("Category: " + category);
        IO.println("==================================");

        ConversionHistory.add(String.format("BMI: %.2f - %s", bmi, category));
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}

