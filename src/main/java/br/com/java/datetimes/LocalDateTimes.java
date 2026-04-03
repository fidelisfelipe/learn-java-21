package br.com.java.datetimes;

import java.time.LocalDateTime;

public class LocalDateTimes {
    public static void main(String[] args) {
            LocalDateTime now = LocalDateTime.now();
            System.out.println("Current date and time: " + now);

            LocalDateTime specificDateTime = LocalDateTime.of(2024, 6, 15, 10, 30);
            System.out.println("Specific date and time: " + specificDateTime);

            LocalDateTime parsedDateTime = LocalDateTime.parse("2024-06-15T10:30:00");
            System.out.println("Parsed date and time: " + parsedDateTime);

            LocalDateTime plusDays = now.plusDays(5);
            System.out.println("Current date and time plus 5 days: " + plusDays);

            LocalDateTime minusHours = now.minusHours(3);
            System.out.println("Current date and time minus 3 hours: " + minusHours);


    }
}
