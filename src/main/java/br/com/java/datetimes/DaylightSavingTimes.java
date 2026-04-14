package br.com.java.datetimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DaylightSavingTimes {
    public static void main(String[] args) {
        //Lisbon
        ZoneId zoneId = ZoneId.of("Europe/Lisbon");
        System.out.println("Lisbon: " + zoneId.getRules().isDaylightSavings(java.time.Instant.now()));

        ZonedDateTime zdt = ZonedDateTime.of(LocalDate.of(2026, 3, 30), LocalTime.of(1, 30), zoneId);

        //Adding one hour to 1:30 am on March 30, 2026, in Lisbon will result in 3:30 am due to the daylight saving time change. This means that the hour from 1:00 am to 2:00 am is skipped, and the clock jumps directly to 3:00 am.
        //Adicionar uma hora às 1:30 da manhã de 30 de março de 2026, em Lisboa, resultará em 3:30 da manhã devido à mudança do horário de verão. Isso significa que a hora das 1:00 às 2:00 é pulada, e o relógio avança diretamente para as 3:00 da manhã.
        ZonedDateTime anHourLater = zdt.plusHours(1);
        //The output will show that the hour is 3, not 2, and the offset will change from +00:00 to +01:00, indicating that daylight saving time has started.
        //A saída mostrará que a hora é 3, não 2, e o deslocamento mudará de +00:00 para +01:00, indicando que o horário de verão começou.
        System.out.println(zdt.getHour() == anHourLater.getHour());
        //The output will show that the hour is 3, not 2, and the offset will change from +00:00 to +01:00, indicating that daylight saving time has started.
        //A saída mostrará que a hora é 3, não 2, e o deslocamento mudará de +00:00 para +01:00, indicando que o horário de verão começou.
        System.out.println(zdt.getOffset().equals(anHourLater.getOffset()));
    }
}
