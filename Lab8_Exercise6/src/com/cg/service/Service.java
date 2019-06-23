package com.cg.service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tanmpath
 */
public class Service {

    public void getDuration(Date user_date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(user_date);
        
        LocalDate given_date = LocalDate.of(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        
        LocalDate sys_date = LocalDate.now();
        
        Period diff = Period.between(sys_date, given_date);
        
        System.out.println("Duration in days : "+Math.abs(diff.getDays()));
        System.out.println("Duration in months : "+Math.abs(diff.getMonths()));
        System.out.println("Duration in years : "+Math.abs(diff.getYears()));
    }
}
