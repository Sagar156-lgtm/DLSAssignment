package com.bridgelabz.DLS_Assinment_Program.Day3;

public class DailyEmployeeWages {
    public static void main(String []args){


        int isEmployee=(int) (Math.random()*10%2);
        System.out.println(isEmployee);

        if (isEmployee==1){
            int time=8;

            int totalWages = time*20;
            System.out.println("Employee is present: ");
            System.out.println("Total wages for a day of a employee =" +totalWages);
        }
        else {
            System.out.println("Employee is absent: ");
            System.out.println("So total wages = "+0);
        }
    }
}
