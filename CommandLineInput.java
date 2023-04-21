
package com.bridgelabz.DLS_Assinment_Program;
import java.util.Scanner;

public class CommandLineInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);
    }
}
