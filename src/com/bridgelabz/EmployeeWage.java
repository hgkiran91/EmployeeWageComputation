package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //Check Employee Attendance
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empHours = 0;
        int empWage = 0;
        int EMP_RATE_PER_HOUR = 20;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        System.out.println(empCheck);

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee Present");
            empHours = 8;
        } else if (empCheck == IS_PART_TIME) {
            System.out.println("Employee Present, Half day");
            empHours = 4;
        } else {
            System.out.println("Employee Absent");
            empHours = 0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage: " + empWage);
    }
}
