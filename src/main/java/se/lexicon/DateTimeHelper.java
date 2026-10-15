package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeHelper {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static String getCurrentDateTime() {
        return LocalDateTime.now().format(FORMATTER);
    }
}