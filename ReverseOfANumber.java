package com.bridgelabz.DLS_Assinment_Program;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= obj.nextInt();

        int rem;
        int ReverseNumber=0;
        while (n!=0){

            rem=n%10;
            ReverseNumber=ReverseNumber*10+rem;
            n/=10;
        }
        System.out.println(ReverseNumber);
    }
}
