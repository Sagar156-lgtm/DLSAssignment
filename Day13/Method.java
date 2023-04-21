package com.bridgelabz.DLS_Assinment_Program.Day13;

import java.util.Scanner;

public class Method {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        Integer x = sc.nextInt();

        System.out.println("Enter the second number: ");
        Integer y = sc.nextInt();

        System.out.println("Enter the third number: ");
        Integer z = sc.nextInt();


        if (x.compareTo(z)==1){


            if (x.compareTo(y)==1){
                System.out.println("x is greater than y and z: " + x);
            }
        }

        if (y.compareTo(z)==1){


            if (y.compareTo(x)==1){
                System.out.println("y is greater than x and z : " + y);
            }
        }

        if (z.compareTo(x)==1){

            if (z.compareTo(y)==1){
                System.out.println("z is greater than x and y : " + z);
            }
        }

    }
}
