package br.com.java.datetimes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatters {
    public static void main(String[] args) {
        //2030-06-07 MMM/dd/yy
        //ISO_LOCAL_DATE
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);
        //ISO Constants
        String formattedDateTime0 = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);//yyyy-mm-ddTHH:mm:ss.nnnn
        String formattedDateTime1 = now.format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);//yyyy-mm-dd
        //String pattern
        String formattedDateTime2 = now.format(java.time.format.DateTimeFormatter.ofPattern("MMM/dd/yy"));
        String formattedDateTime3 = now.format(java.time.format.DateTimeFormatter.ofPattern("MMMM/dd/yy"));
        String formattedDateTime4 = now.format(java.time.format.DateTimeFormatter.ofPattern("MMMM/dd\n yyyy hh:mm"));
        System.out.println("Formatted date and time: " + formattedDateTime0);
        System.out.println("Formatted date and time: " + formattedDateTime1);
        System.out.println("Formatted date and time: " + formattedDateTime2);
        System.out.println("Formatted date and time: " + formattedDateTime3);
        System.out.println("Formatted date and time: " + formattedDateTime4);

        //Localized format Styles
        String formattedDateTime5 = now.format(java.time.format.DateTimeFormatter.ofLocalizedDate(java.time.format.FormatStyle.SHORT));
        String formattedDateTime6 = now.format(java.time.format.DateTimeFormatter.ofLocalizedDate(java.time.format.FormatStyle.MEDIUM));
        String formattedDateTime7 = now.format(java.time.format.DateTimeFormatter.ofLocalizedDate(java.time.format.FormatStyle.LONG));
        String formattedDateTime8 = now.format(java.time.format.DateTimeFormatter.ofLocalizedDate(java.time.format.FormatStyle.FULL));
        String formattedDateTime9 = now.format(java.time.format.DateTimeFormatter.ofLocalizedDateTime(java.time.format.FormatStyle.MEDIUM));

        System.out.println("Formatted date and time: " + formattedDateTime5);
        System.out.println("Formatted date and time: " + formattedDateTime6);
        System.out.println("Formatted date and time: " + formattedDateTime7);
        System.out.println("Formatted date and time: " + formattedDateTime8);
        System.out.println("Formatted date and time: " + formattedDateTime9);
    }
}
