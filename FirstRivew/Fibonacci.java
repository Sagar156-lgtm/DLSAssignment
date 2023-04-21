package com.bridgelabz.DLS_Assinment_Program.FirstRivew;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int n1=0;
        int n2=1;
        System.out.println(n1);
        System.out.println(n2);
        int n3;

        for (int i=2;i<n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}
