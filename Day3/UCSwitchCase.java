package com.bridgelabz.DLS_Assinment_Program.Day3;

public class UCSwitchCase {
    public static void main(String []args){

        int isPresent = (int) (Math.random()*10%2);
        System.out.println(isPresent);
        int d=isPresent;

        switch (d){

            case 1:
                System.out.println("Employee is present: ");
                int totalWages=30*8*20;
                System.out.println("Total wages = " +totalWages);
                break;

            default:
                System.out.println("Employee is absent:");
                System.out.println("Total wages = "+0);


        }

    }
}
