package br.com.java.datetimes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimes {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based - January is 0, December is 11
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR); // Week of the year - 1 to 53 - depending on the year
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // 1 to 31
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); // 1 (Sunday) to 7 (Saturday)
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR); // 1 to 366 - depending on the year

        int hour = calendar.get(Calendar.HOUR); // 0 to 11
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 0 to 23
        int minute = calendar.get(Calendar.MINUTE); // 0 to 59
        int second = calendar.get(Calendar.SECOND); // 0 to 59
        int millisecond = calendar.get(Calendar.MILLISECOND); // 0 to 999

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Week of Year: " + weekOfYear);
        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Day of Week: " + dayOfWeek);
        System.out.println("Day of Year: " + dayOfYear);

        System.out.println("Hour: " + hour);
        System.out.println("Hour of Day: " + hourOfDay);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Millisecond: " + millisecond);
        System.out.println("-----------------------------");

         calendar.set(Calendar.YEAR, 2026);
         calendar.set(Calendar.MONTH, Calendar.MARCH);
         calendar.set(Calendar.DAY_OF_MONTH, 31);
         calendar.set(Calendar.HOUR_OF_DAY, 23);
         calendar.set(Calendar.MINUTE, 11);
         calendar.set(Calendar.SECOND, 40);

         System.out.println("Date: "+ calendar.getTime());
         SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy hh.mm");
         var dateString = sdf.format(calendar.getTime());
         System.out.println("Formatted Date: " + dateString);

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yy hh:mm:ss");
        var dateString2 = sdf2.format(calendar.getTime());
        System.out.println("Formatted Date: " + dateString2);

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2025, Calendar.DECEMBER, 25);
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
        calendar1.add(Calendar.DAY_OF_MONTH, 5);
        var dateString3 = sdf3.format(calendar1.getTime());
        System.out.println("Formatted Date: " + dateString3);
    }
}
