package com.bridgelabz.DLS_Assinment_Program.Day6;

public class Binary2 {
    public static void main(String[] args) {

        int num = 150;
        int swapnum;


        swapnum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);



        System.out.println();

        System.out.println("Before swapping the nibble "+ num);
        System.out.println("After swapping the nibble "+ swapnum);

    }
}
