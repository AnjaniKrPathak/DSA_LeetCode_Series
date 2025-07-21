package com.dsa.leetcode.maths;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

/**
 * Day of the Week
 */
public class LeetCode1185 {
    public static void main(String[] args) {
        int day = 31, month = 8, year = 2019;
        String dayOfWeek = weekDay(day,month,year);
        System.out.print(dayOfWeek);

        }

    private static String weekDay(int day, int month, int year) {
        LocalDate localDate= LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek =  localDate.getDayOfWeek();
        return String.valueOf(dayOfWeek);
    }

}
