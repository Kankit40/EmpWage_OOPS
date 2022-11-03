package com.bridgelabz;
import java.util.Scanner;

public class EmployeeWage extends Data {
    static int totalWage;
    int Present(int x, int y) {
        int dailyWage = x * y * 1;
        System.out.println("The daily wage is " + dailyWage);
        return dailyWage;
    }

    int Absent(int x, int y) {
        int dailyWage = x * y * 0;
        System.out.println("The daily wage is " + dailyWage);
        return dailyWage;
    }

    int Halfday(int x, int y) {
        int dailyWage = (x * y * 1) / 2;
        System.out.println("The daily wage is " + dailyWage);
        return dailyWage;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Exployee Wage");
        System.out.println("Enter the company number");
        System.out.println("0. Samsung");
        System.out.println("1. Nokia");
        System.out.println("2. Micromax");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int totalWage1 = 0;
        int totalWorkinghrs = 0;
        int totalDays = 0;
        int dailyHours = 0;

        EmployeeWage obj1 = new EmployeeWage();
        Data obj = new Data();
        obj.Name();
        obj.Wage();
        obj.Days();
        obj.Hours();
        obj.Dailyhrs();



        System.out.println("The company is " + obj.name[i]);

        while (totalWorkinghrs < obj.workingHours[i] && totalDays < obj.maxWorkingDays[i]) {

            int o = (int) (Math.random() * 3);

            if (o == 1) {
                totalWage = obj1.Present(obj.dailyhrs[i], obj.wage[i]);
                dailyHours = obj.dailyhrs[i];
                totalDays++;

            } else if (o == 2) {
                totalWage = obj1.Absent(obj.dailyhrs[i], obj.wage[i]);
                dailyHours = 0;

            } else {
                totalWage = obj1.Halfday(obj.dailyhrs[i], obj.wage[i]);
                totalDays++;
                dailyHours = (obj.dailyhrs[i])/2;
            }
            totalWage1 = totalWage1 + totalWage;
            totalWorkinghrs = totalWorkinghrs + dailyHours;
        }

        System.out.println("Total wage is " +totalWage1);
        System.out.println("Total working days are " + totalDays);
        System.out.println("Total working hours are " + totalWorkinghrs);
        System.out.println("---------------------------------------------------");
    }
}