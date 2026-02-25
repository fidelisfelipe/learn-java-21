package br.com.java.controlFlow;

import java.util.Scanner;

public class SwitchCaseStatement {

    public static void main(String caseSwitch []) {

        Scanner sc = new Scanner(System.in);

        int dayNum = sc.nextInt();

        String day = "undefined";
        
        switch (dayNum){
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Thursday";
                    break;
                case 4:
                    day = "Friday";
                    break;
                case 5:
                    day = "Saturday";
                    break;
                case 6:
                    day = "Sunday";
                    break;
                default:
                    day = "Invalid day choice";
                    break;
        }

        System.out.println(day);

        switch (dayNum){
                case 1: case 2:
                case 3: case 4:
                case 5:
                    day = "Weekday";
                    break;
                case 6: case 7:
                    day = "Weekend";
                break;
            default:
                day = "Invalid day choice";
                break;
        }

        System.out.println(day);

    }
}
