package com.bridgelabz.DLS_Assinment_Program.Day6;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the month between 1 to 12: " );
        int m= obj.nextInt();
        System.out.println("Enter the date: ");
        int d= obj.nextInt();
        System.out.println("Enter the year: ");
        int y= obj.nextInt();

        int  y0 =y-(14-m)/12;

        int x=y0 + y0/4 -y0/100 + y0/400;

        int m0=m+12*((14-m)/12) -2;

        int d0=(d+x+31*m0/12)%7;

        switch (d0){
            case 1:
                System.out.println("Monday: ");
                break;
            case 2:
                System.out.println("Tuesday: ");
            case 3:
                System.out.println("Wednesday: ");
                break;
            case 4:
                System.out.println("Thursday: ");
                break;
            case 5:
                System.out.println("Friday: ");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday: ");
                break;
        }

    }
}
