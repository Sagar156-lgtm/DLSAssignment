package com.bridgelabz.DLS_Assinment_Program.Day3;

public class TotalWagesForA_Month {
    public static void main(String []args)
    {
        int isPresent=(int) (Math.random()*10%2);
        System.out.println(isPresent);

        if (isPresent==1){

            int totalWages=30*8*20;
            System.out.println("Employee is present: ");
            System.out.println("Total wages of a employee for a month = " + totalWages);

        }
        else {

            System.out.println("Employee is absent: ");
            System.out.println("Total wages = " + 0);

        }

    }
}
