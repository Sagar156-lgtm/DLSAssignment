package com.bridgelabz.DLS_Assinment_Program.Day5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N= obj.nextInt();


        for (int i=0;i<=N;i++) {
            int a=2;
            System.out.println(Math.pow(a, i));

        }


    }



}
