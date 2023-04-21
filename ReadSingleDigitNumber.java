package com.bridgelabz.DLS_Assinment_Program;

import java.util.Scanner;
public class ReadSingleDigitNumber {
    public static void main(String []args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=obj.nextInt();
        String str=Integer.toString(num);
        System.out.println(str);
    }
}
