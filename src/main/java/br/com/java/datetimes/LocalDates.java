package br.com.java.datetimes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class LocalDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);

        int year = date.getYear();
        int monthValue = date.getMonthValue();
        Month monthName = date.getMonth();
        int dayOfYear = date.getDayOfYear();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekValue = dayOfWeek.getValue();
        System.out.println("Year: " + year);
        System.out.println("Month (number): " + monthValue);
        System.out.println("Month (name): " + monthName);
        System.out.println("Day of year: " + dayOfYear);
        System.out.println("Day of month: " + dayOfMonth);
        System.out.println("Day of week: " + dayOfWeek);
        System.out.println("Day of week (number): " + dayOfWeekValue);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Day of week (number) using Calendar: " + calendar.get(Calendar.DAY_OF_WEEK));

        LocalDate twoWeeksAgo = date.minusWeeks(2);
        System.out.println("Two weeks ago: " + twoWeeksAgo);

        LocalDate fivedaysLater = date.plusDays(5);
        System.out.println("Five days later: " + fivedaysLater);

        //LocalDate is immutable
        System.out.println("Original date: " + date);

        LocalDate bornDate = LocalDate.of(1990, Month.JANUARY, 1);
        System.out.println("Born date: " + bornDate);

        //is after
        System.out.println("Is born date after current date? " + bornDate.isAfter(date));




    }
}
