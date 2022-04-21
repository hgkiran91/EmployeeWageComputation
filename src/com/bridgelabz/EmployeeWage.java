package com.bridgelabz;

import java.security.PublicKey;

public class EmployeeWage {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS_IN_MONTH = 100;
    public static final int FULL_TIME_WORKING_HOURS = 16;
    public static final int PART_TIME_WORKING_HOURS = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //Variables
        int empWage = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        int totalHours = 0;
        while (totalWorkingDays < MAX_WORKING_DAYS && totalHours <= MAX_WORKING_HOURS_IN_MONTH) {
            //Check Employee Attendance
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(empCheck);
            System.out.println("Total Working Hours: " + totalHours);
            //Switch case to check emp hours on attendance
            switch (empCheck) {
                case IS_FULL_TIME:
                    empWage = FULL_TIME_WORKING_HOURS * EMP_RATE_PER_HOUR;
                    totalHours += FULL_TIME_WORKING_HOURS;
                    break;
                case IS_PART_TIME:
                    empWage = PART_TIME_WORKING_HOURS * EMP_RATE_PER_HOUR;
                    totalHours += PART_TIME_WORKING_HOURS;
                    break;
                default:
                    empWage = 0;
            }
            System.out.println("Daily wage of Day# " + (totalWorkingDays + 1) + " is " + empWage);
            totalEmpWage += empWage;
            System.out.println("Total Employee Wage: " + totalEmpWage);
            totalWorkingDays++;
        }
    }
}
