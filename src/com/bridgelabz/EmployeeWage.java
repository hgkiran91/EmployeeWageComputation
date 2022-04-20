package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //Check Employee Attendance
        int empPresent = 1;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;

        System.out.println(empCheck);

        if (empCheck == empPresent) {
            System.out.println("Employee Present");
        } else {
            System.out.println("Employee Absent");
        }
    }
}
