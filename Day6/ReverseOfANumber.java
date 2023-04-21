package com.bridgelabz.DLS_Assinment_Program.Day6;

public class ReverseOfANumber {
    public static void main(String[] args) {
        int rem,reverseNumber=0;
        int n=2579;
        for (int i=0;i<=n;i++){
            rem=n%10;
            reverseNumber=reverseNumber*10+rem;
            n/=10;
        }
        System.out.println("Reverse number: " + reverseNumber);
    }
}
