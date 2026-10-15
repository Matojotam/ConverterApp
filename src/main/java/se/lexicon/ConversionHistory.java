package se.lexicon;

import java.util.ArrayList;

public class ConversionHistory {

    private static final ArrayList<String> history = new ArrayList<>();

    public static void add(String entry) {
        history.add(entry);
    }

    public static void showHistory() {
        IO.println("");
        IO.println("======= Conversion History =======");

        if (history.isEmpty()) {
            IO.println("No conversions performed yet.");
        } else {
            for (int i = 0; i < history.size(); i++) {
                IO.println((i + 1) + ". " + history.get(i));
            }
        }

        IO.println("==================================");
        IO.println("Total conversions: " + history.size());
        IO.println("Goodbye!");
    }
}