package com.bridgelabz.DLS_Assinment_Program.Day5;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x= obj.nextInt();
        System.out.println("Enter the value of y: ");
        int y= obj.nextInt();
        int x1=0;
        int y1=0;

       double z=Math.sqrt(Math.pow(x1-x,2) + Math.pow(y1-y,2));

        System.out.println(z);
    }
}
