package com.bridgelabz.DLS_Assinment_Program.Day5;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of t which is less than 50: ");
        int t= obj.nextInt();
        System.out.println("Enter the value of v in between 3 to 120: ");
        double v= obj.nextInt();

        double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
        System.out.println(w);
    }
}
