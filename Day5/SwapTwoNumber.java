package com.bridgelabz.DLS_Assinment_Program.Day5;

public class SwapTwoNumber {
    static int x=2;
    static int y=5;
    public static void main(String[] args) {

        System.out.println("Before swapping : ");
        System.out.println("x = " + x);
        System.out.println("y = " +y);

        System.out.println("After the swapping: ");
        x=x+y; //7
        y=x-y;  //7-5=2
        x=x-y;  //7-2=5
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
