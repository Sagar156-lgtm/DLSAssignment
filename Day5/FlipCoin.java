package com.bridgelabz.DLS_Assinment_Program.Day5;

import java.util.Scanner;

public class FlipCoin {
    static int number;
    int tails=0;
    int head=0;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        number= sc.nextInt();

        FlipCoin obj= new FlipCoin();

        for (int i=0;i<number;i++) {
           double random =(Math.random());

            if (number < .5) {
                obj.tails++;
            } else {
                obj.head++;

            }
        }
        double tailsPercentage= (obj.tails/number)*100;
        double headPercentage=(obj.head/number)*100;

        System.out.println("Tail percentage = " + tailsPercentage);
        System.out.println("Head percentage = " + headPercentage);
    }
}
