package com.bridgelabz.DLS_Assinment_Program;

import java.util.Scanner;

public class PalindromeForLoops {
    public static void main(String []args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= obj.nextInt();
        int rem,newNum=0,temp;
        temp=n;
        while(n!=0){
            rem=n%10;
            newNum=newNum*10+rem;
            n/=10;
        }

        if(newNum==temp){
            System.out.println("This is a palindrome: " + newNum);
        }
        else {
            System.out.println("This is nat a palindrome:" + newNum);
        }
    }
}
