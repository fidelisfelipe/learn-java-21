package br.com.java.datetimes;

import java.time.LocalTime;

public class LocalTimes {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int nano = time.getNano();
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Nano: " + nano);

        LocalTime twoHoursAgo = time.minusHours(2);
        System.out.println("Two hours ago: " + twoHoursAgo);

        LocalTime thirtyMinutesLater = time.plusMinutes(30);
        System.out.println("Thirty minutes later: " + thirtyMinutesLater);

        //LocalTime class is immutable
        System.out.println("Original time: " + time);

        time = time.plusHours(1);
        System.out.println("One hour later: " + time);

        LocalTime appoinmenttime = LocalTime.of(14, 30, 1);
        System.out.println("Appoinment time: " + appoinmenttime);

        //compare
        LocalTime now = LocalTime.now();
        System.out.println("Is appoinment time after now? " + appoinmenttime.isAfter(now));



    }
}
