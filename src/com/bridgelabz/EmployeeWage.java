package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //Check Employee Attendance
        int empPresent = 1;
        int empHours=0;
        int empWage=0;
        int EMP_RATE_PER_HOUR=20;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;

        System.out.println(empCheck);

        if (empCheck == empPresent) {
            System.out.println("Employee Present");
            empHours=8;
        }
        else {
            System.out.println("Employee Absent");
            empHours=0;
        }
        empWage=empHours*EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage: "+empWage);
    }
}
