package br.com.java.datetimes;

import java.time.Instant;

public class Instants {
    public static void main(String[] args) throws InterruptedException {
        // Login time 2021-01-12T21:58:18:817Z
        Instant loginTime = Instant.now();
        System.out.println("Login time: " + loginTime);
        Thread.sleep(1000);

        Instant logoutTime = Instant.now();
        System.out.println("Logout time: " + logoutTime);

        loginTime = loginTime.truncatedTo(java.time.temporal.ChronoUnit.MINUTES);
        logoutTime = logoutTime.truncatedTo(java.time.temporal.ChronoUnit.MINUTES);

        System.out.println("Login time: " + loginTime);
        System.out.println("Logout time: " + logoutTime);
        System.out.println("Is logout time after login time? " + logoutTime.isAfter(loginTime));

        if(logoutTime.isAfter(loginTime)){
            System.out.println("User logged out successfully.");
        } else {
            System.out.println("User is still logged in.");
        }

    }
}
