package com.bridgelabz.DLS_Assinment_Program.Day6;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        int Num=5;
        System.out.println(n1);
        System.out.println(n2);

        for (int i=2;i<Num;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}
