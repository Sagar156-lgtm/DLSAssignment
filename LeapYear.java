package com.bridgelabz.DLS_Assinment_Program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String []args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int z= obj.nextInt();
        if(z>= 1582){
            if ((z%4==0 &&z%100!=0) || (z%4==0 && z%400==0)){
                System.out.println("This is a leap year: " + z);
            }
            else {
                System.out.println("This is not a leap year:");
            }
        }
    }
}
