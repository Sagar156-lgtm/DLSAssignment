package com.bridgelabz.DLS_Assinment_Program.Day3;

public class EmployeeIsPresent {
    public static void main(String []args) {


        int employeeIsPresent = (int) (Math.random() * 10 % 2);
        if (employeeIsPresent == 1) {
            System.out.println("Employee is present: " + employeeIsPresent);
        }
    }
}
