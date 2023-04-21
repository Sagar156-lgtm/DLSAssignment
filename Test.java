package com.bridgelabz.DLS_Assinment_Program;

public class Test {
    public static void main(String [] args){
        int n=321;
        int rem;
        int ReverseNumber=0;
        while (n!=0){

            rem=n/10;
            ReverseNumber=ReverseNumber*10+rem;
            n/=10;
        }
        System.out.println(ReverseNumber);
    }
}
