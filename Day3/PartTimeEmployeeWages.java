package com.bridgelabz.DLS_Assinment_Program.Day3;

public class PartTimeEmployeeWages {
    public static  void main(String []args){

        int isPartTimeEmployee=(int) (Math.random()*10%2);
        System.out.println(isPartTimeEmployee);

        if (isPartTimeEmployee==1){

            int totalWages=4*20;
            System.out.println("Part time employee is present: ");
            System.out.println("Total wages of a part time employee = " + totalWages);
        }

        else {
            System.out.println("Part time employee is absent: ");
            System.out.println("So total wages = " + 0);
        }
    }
}
