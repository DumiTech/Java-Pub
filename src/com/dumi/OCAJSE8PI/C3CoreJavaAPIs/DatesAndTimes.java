package com.dumi.OCAJSE8PI.C3CoreJavaAPIs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2022, 06, 16);
        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 1);
        LocalTime time1 =  LocalTime.of(6, 15);

        LocalDateTime dateTime1 = LocalDateTime.of(2022, 12, 12, 12, 12, 12, 1200);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime2);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date);
        System.out.println(time);
    }
}
