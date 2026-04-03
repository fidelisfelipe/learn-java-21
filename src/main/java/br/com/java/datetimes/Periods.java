package br.com.java.datetimes;

import java.time.Period;

public class Periods {
    public static void main(String[] args) {
        // Period is used to represent a date-based amount of time in the ISO-8601 calendar system, such as '2 years, 3 months and 4 days'.
        // It can be used to calculate the difference between two dates or to add/subtract a specific amount of time to/from a date.
        // The Period class is immutable and thread-safe.

        // Creating a Period of 2 years, 3 months and 4 days
        java.time.Period period = java.time.Period.of(2, 3, 4);
        System.out.println("Period: " + period);

        // Calculating the difference between two dates
        java.time.LocalDate startDate = java.time.LocalDate.of(2020, 1, 1);
        java.time.LocalDate endDate = java.time.LocalDate.of(2022, 4, 5);
        java.time.Period difference = java.time.Period.between(startDate, endDate);
        System.out.println("Difference between " + startDate + " and " + endDate + ": " + difference);

        // Adding a Period to a date
        java.time.LocalDate newDate = startDate.plus(period);
        System.out.println("New date after adding period: " + newDate);

        //period with loop
        Period oneDay = java.time.Period.ofDays(1);
        int i = 0;
        while (i < 5) {
            startDate = startDate.plus(oneDay);
            System.out.println("Date after adding " + (i + 1) + " day(s): " + startDate);
            i++;
        }
        System.out.println("Original start date: " + java.time.LocalDate.of(2020, 1, 1));
    }
}
