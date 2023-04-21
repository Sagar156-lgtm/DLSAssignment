package com.bridgelabz.DLS_Assinment_Program.FirstRivew;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int d= obj.nextInt();
        if(d<10){
            if ((d%4!=0 && d%6!=0) && (d%8!=0 && d%9!=0)){
                System.out.println("Prime number: " + d);
            }
            else {
                System.out.println("It is not a prime number: " + d );
            }
        }
            else if (d>10) {
                if ((d%2!=0 && d%3!=0) &&  (d%5!=0 && d%7!=0)){
                    System.out.println("This is a prime number: " + d);
                }else  {
                System.out.println("It is not a prime number: " + d);
            }

        }
    }
}
