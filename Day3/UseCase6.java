package com.bridgelabz.DLS_Assinment_Program.Day3;

import java.util.Scanner;

public class UseCase6 {
    public static void main(String []args){
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter total day: ");
        int totalDay=obj.nextInt();

        System.out.println("Enter the total hours: ");
        int totalHours= obj.nextInt();

        int isPresent = (int) (Math.random()*10%2);
        System.out.println(isPresent);

        if(isPresent==1){
            int totalWages=totalDay*totalHours*20;
            System.out.println("Total wages of a employee = " + totalWages);
        }

        else {
            System.out.println("Employee is absent: ");
        }
    }
}
