package com.bridgelabz;

public class Data {
   static String[] name;
   static int [] wage;
   static int [] maxWorkingDays;
   static int [] workingHours;
   static int [] dailyhrs;

    void Name(){
     name = new String[]{"Samsung", "Nokia", "Micromax"};
    }

    void Wage(){
     wage = new int[]{35, 26, 20};
    }

    void Days(){
     maxWorkingDays = new int[]{20, 26, 30};
    }

    void Hours(){
     workingHours = new int[]{110, 100, 120};
    }

    void Dailyhrs(){
        dailyhrs = new  int[]{8, 8, 8};
    }

}