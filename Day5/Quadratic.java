package com.bridgelabz.DLS_Assinment_Program.Day5;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a= obj.nextInt();
        System.out.println("Enter the b: ");
        int b= obj.nextInt();
        System.out.println("Enter the c: ");
        int c= obj.nextInt();

        double delta=b*b-4*a*c;
        System.out.println(delta);
        double x1= (-b + Math.sqrt(delta))/(2*a);
        double x2=(- b - Math.sqrt(delta))/(2*a);

        System.out.println("First Root of a quadratic function x1 = : " +x1);
        System.out.println("Second Root of a quadratic function x2 = :" + x2);

    }
}
