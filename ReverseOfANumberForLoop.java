package com.bridgelabz.DLS_Assinment_Program;

public class ReverseOfANumberForLoop {
    public static void main(String []args){
        int n=4563;
        int rem;
        int ReverseNumber=0;
        for (int i=0;i<n;i++){
            rem=n%10;
            ReverseNumber=ReverseNumber*10+rem;
            n/=10;
        }
        System.out.println(ReverseNumber);
    }
}
