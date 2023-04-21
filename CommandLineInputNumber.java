package com.bridgelabz.DLS_Assinment_Program;
import java.util.Scanner;

public class CommandLineInputNumber {


    public static void main(String []args){
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the two numbers: ");
        int num1=obj.nextInt();
        int num2= obj.nextInt();

        System.out.println("Sum of two number is:" +(num1 + num2) );



    }
}
