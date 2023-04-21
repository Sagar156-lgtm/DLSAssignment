package com.bridgelabz.DLS_Assinment_Program;

import java.util.Scanner;

public class NumberInString {
    public static void main(String []args){

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");

        int d= obj.nextInt();
        if (d==1){

            System.out.println( d+"=" + "one");
        } else if (d==2) {

            System.out.println( d+"=" + "two");
        }else if (d==3) {

            System.out.println( d+"=" + "three");
        }else if (d==4) {

            System.out.println( d+"=" + "four");
        }else if (d==5) {

            System.out.println( d+"=" + "five");
        }else if (d==6) {

            System.out.println( d+"=" + "six");
        }else if (d==7) {

            System.out.println( d+"=" + "seven");
        }else if (d==8) {

            System.out.println( d+"=" + "eight");
        }else if (d==9) {

            System.out.println( d+"=" + "nine");
        }
        else {
            System.out.println("Enter the number between 1 to 9:  ");
        }
    }
}
