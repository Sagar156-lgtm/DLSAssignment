package com.bridgelabz.DLS_Assinment_Program.FirstRivew;

public class TestPrimeNumber {
    public static void main(String[] args) {
        int n=15;
        int count =0;

        if (n<1){
            System.out.println("Not a prime number: ");
        }

        for (int i=1;i<n/2;i++){
            if (n%i==0){
                count++;
            }
        }

        if (count>1){
            System.out.println("Not a prime: ");
        }

        else {
            System.out.println("It is a prime number: " + n);
        }
    }
}
