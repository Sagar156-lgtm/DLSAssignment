package com.bridgelabz.DLS_Assinment_Program.Day6;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of P: ");
        double P= obj.nextInt();

        System.out.println("Enter the value of Y: ");
        int Y= obj.nextInt();

        System.out.println("Enter the value of R: ");
        double R= obj.nextInt();

        double n=12*Y;
        System.out.println(n);
        double r=R/(12*100);
        System.out.println(r);

       double payment= P*r/1-Math.pow((1+r),-n);
        System.out.println("Monthly payment is: " + payment);

    }
}
