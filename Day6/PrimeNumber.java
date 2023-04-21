package com.bridgelabz.DLS_Assinment_Program.Day6;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=14;
        int count=0;

        for (int i=1;i<n/2;i++){

            if (n%i==0){
                count++;
            }
        }
        if (count>1) {
            System.out.println("Not a prime number: " + n);
        }
        else {
            System.out.println("It is a prime number: " + n);
        }

    }
}
