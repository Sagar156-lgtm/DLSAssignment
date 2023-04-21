package com.bridgelabz.DLS_Assinment_Program.Day6;

public class PerfectNumber {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        int temp =0;
        for (int i=1;i<n/2;i++){
            if (n%i==0) {
                sum = sum + n;
                //count++;
            }
            temp=n;

        }
        if (sum==temp){
            System.out.println("It is a perfect number: " + sum);
        }

        else {
            System.out.println("It is not a perfect number :");
        }

    }
}
