package com.bridgelabz;

import java.util.Scanner;

public class EmployeeWage extends Data{


    public static void main(String[] args) {

        int exit = 99;
        while (exit == 99){
            System.out.println("Enter the following digits :");
            System.out.println("01: Enter company Data");
            System.out.println("02: Fetch Company Data");
            System.out.println("03: Compute wage");
            System.out.println("04: Exit");

            Scanner sc1 = new Scanner(System.in);
            int inp = sc1.nextInt();
            EmployeeWage obj = new EmployeeWage();

            if (inp == 1){
                obj.AddData();

            } else if (inp == 2) {
                obj.Display();

            } else if (inp == 3) {
                obj.ComputeWage();
            } else if (inp == 4) {
                exit = 100;
            }
        }
    }
}
