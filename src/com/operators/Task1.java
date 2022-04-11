package com.operators;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the day of the week: ");
        int dayOfTheWeekNumber = myScanner.nextInt();
        String dayOfTheWeekEnding = new String();
        String dayOfTheWeek = new String();
        boolean isValidDay = true;

        switch (dayOfTheWeekNumber) {
            case 1:
                dayOfTheWeekEnding = "st";
                dayOfTheWeek = "Monday";
                break;
            case 2:
                dayOfTheWeekEnding = "nd";
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeekEnding = "rd";
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeekEnding = "th";
                dayOfTheWeek = "Thursday";
                break;
            case 5:
                dayOfTheWeekEnding = "th";
                dayOfTheWeek = "Friday";
                break;
            case 6:
                dayOfTheWeekEnding = "st";
                dayOfTheWeek = "Saturday";
                break;
            case 7:
                dayOfTheWeekEnding = "th";
                dayOfTheWeek = "Sunday";
                break;
            default:
                isValidDay = false;
        }
        if (isValidDay) {
            System.out.println("The " + dayOfTheWeekNumber + "-" + dayOfTheWeekEnding + " day of the week is " + dayOfTheWeek);
        } else {
            System.out.println("Invalid day of the week");
        }
    }
}
