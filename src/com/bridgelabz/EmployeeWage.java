package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {
        //Use case 1

        System.out.println("Welcome to Employee wage");

        int empCheck = (int)(Math.random() * 2);
        int wage = 0;
        int isFulltime = 1;
        int empHrs = 0;
        int empWageperHrs = 20;

        if(empCheck==isFulltime){
            System.out.println("The employee is present");
            empHrs = 8;


        }else{
            System.out.println("Employee is Absent");
            empHrs = 0;
        }

        wage = empHrs * empWageperHrs;
        System.out.println("The employee wage is  "+ wage);
    }
}
