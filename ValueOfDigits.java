package com.bridgelabz.DLS_Assinment_Program;
import java.util.Scanner;

public class ValueOfDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a 3 digit number : ");

        int n=obj.nextInt();


        int hundred = (n/100)%10;
       if(hundred<=9){
           System.out.printf("Hundreds place digit: " + hundred);
       }

        int tens= (n/10)%10;
        if (tens<=9) {
           System.out.printf("\nTens place digit: " + tens);
       }
        int one=(n/1)%10;
       if(one<=9) {
           System.out.printf("\nOnes place digit: " + one);
       }
       else {
           System.out.println("End of the program");
       }

    }

}
