package com.dumi.OCAJSE8PI.C3CoreJavaAPIs;

import java.time.*;

public class DateAndTimePractice2 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);
        Period annually = Period.ofYears(1);
        Period quarterly = Period.ofMonths(3);
        Period everyOtherDay = Period.ofDays(2);
        Period everyYearAndAWeek = Period.of(1, 0, 7);
        performAnimalEnrichment(start, end, period);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
