package com.bridgelabz;

public class EmployeeWage {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        //Variables
        int empHours = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        //For loop to keep the Max_Working_Days under 20days
        for (int day = 0; day < MAX_WORKING_DAYS; day++) {
            //Check Employee Attendance
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(empCheck);

            //Switch case to check emp hours on attendance
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            empWage = empHours * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee Wage: " + empWage);
        }
        System.out.println("Total Monthly Emp Wage: " + totalEmpWage);
    }
}
