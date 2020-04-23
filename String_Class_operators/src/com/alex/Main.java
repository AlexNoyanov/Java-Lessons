package com.alex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

/**
    Lesson about operations with String class in Java

 By Alexander Noyanov
 April 22nd 2020


 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        //


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        LocalDate dateNow = LocalDate.now();

        String currentDate = now.toString();

        int indexOfTime = currentDate.indexOf('T');
        String dateHour = currentDate.substring(0,currentDate.indexOf('T'));
        LocalTime timeNow = LocalTime.now();
        String timeShort = timeNow.toString();


        System.out.println("Full date and time :" + currentDate);
        System.out.println("Just date here: "+dateNow);
        System.out.println("Just time: " +  timeNow);

    }
}
