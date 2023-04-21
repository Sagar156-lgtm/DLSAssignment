package com.bridgelabz.DLS_Assinment_Program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String []args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x= obj.nextInt();
        int sum=0;
        int n=1;
        while (n<=x){
            sum =sum+n;
            n++;
        }
        System.out.println(sum);
    }
}
