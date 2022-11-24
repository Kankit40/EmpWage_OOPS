package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<Integer> workingDays = new ArrayList<>();
    static ArrayList<Integer> maxWorkinghrs = new ArrayList<>();
    static ArrayList<Integer> dailyWage = new ArrayList<>();
    static ArrayList<Integer> dailyHrs = new ArrayList<>();
    static int totalWage;

    public void AddData(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the name of the company");
        String a1 = sc2.nextLine();
        name.add(a1);

        System.out.println("Enter maximum working days in month");
        int a2 = sc2.nextInt();
        workingDays.add(a2);

        System.out.println("Enter maximum working hours in month");
        int a3 = sc2.nextInt();
        maxWorkinghrs.add(a3);

        System.out.println("Enter daily wage");
        int a4 = sc2.nextInt();
        dailyWage.add(a4);

        System.out.println("Enter daily hours");
        int a5 = sc2.nextInt();
        dailyHrs.add(a5);
    }

    public void Display(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the name of the company");
        String b1 = sc3.nextLine();
        int b2 = name.indexOf(b1);

        System.out.println("The name of the company is " + name.get(b2));
        System.out.println("The maximum working days are " + workingDays.get(b2));
        System.out.println(" The maximum working hours are " + maxWorkinghrs.get(b2));
        System.out.println(" The daily wage is " + dailyWage.get(b2));
        System.out.println("The daily working hours are " + dailyHrs.get(b2));
    }

    public void ComputeWage(){

        int totalWage1 = 0;
        int totalWorkinghrs = 0;
        int totalDays = 0;
        int dailyHours = 0;

        System.out.println("Enter the name of the company");
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter the name of the company");
        String c1 = sc4.nextLine();
        int c2 = name.indexOf(c1);

        int c4 = maxWorkinghrs.get(c2);
        int c5 = workingDays.get(c2);
        int c6 = dailyHrs.get(c2);
        int c7 = dailyWage.get(c2);

        while (totalWorkinghrs < c4 && totalDays < c5) {

            int o = (int) (Math.random() * 3);

            if (o == 1) {
                totalWage = c6 * c7;
                dailyHours = c6;
                totalDays++;

            } else if (o == 2) {
                totalWage = c6 * c7 * 0;
                dailyHours = 0;

            } else {
                totalWage = (c6 * c7)/2;
                totalDays++;
                dailyHours = (c6)/2;
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


