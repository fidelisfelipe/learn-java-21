package br.com.java.datetimes;

import java.time.Duration;
import java.time.Period;

public class PeriodsTest {

    //duracao é represntada em segundos, minutos, horas
    //period dias, semanas, meses e anos - ISO 8601 
    public static void main(String[] args) {

        //Du

        //representada em segundos PT 5S
        Duration duration = Duration.ofMillis(5000);
        System.out.println("Duration ofMillis: " + duration);

        //representada em segundos
        duration = Duration.ofSeconds(59                                                                                                                                                                                                                                                                                                                                                                                                    );
        System.out.println("Duration ofSeconds: " + duration);

        //PT 1M
        duration = Duration.ofSeconds(60);//a partir de 60 segundos, ele converte para minutos
        System.out.println("Duration ofSeconds: " + duration);

        //PT 1M
        duration = Duration.ofSeconds(61);//a partir de 60 segundos, ele converte para minutos
        System.out.println("Duration ofSeconds: " + duration);

        Period period = Period.ofDays(1);
        System.out.println("Period ofDays: " + period);

        period = Period.ofDays(366);
        System.out.println("Period ofDays: " + period);

        period = Period.ofMonths(13);
        System.out.println("Period ofMonths: " + period);

        period = Period.ofMonths(72);
        System.out.println("Period ofMonths: " + period);

        period = Period.ofYears(10);
        System.out.println("Period ofYears: " + period);
    }
}
