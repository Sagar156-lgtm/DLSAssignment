package com.bridgelabz.DLS_Assinment_Program.Day6;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        long start,end;
        double time;

        System.out.println("Type any character to start the stopwatch");
        char s=obj.next().charAt(0);
        start=System.currentTimeMillis();

        System.out.println("Type any character to stop the stopwatch");
        char m=obj.next().charAt(0);
        end=System.currentTimeMillis();

        time=(end-start)/1000.0;
        System.out.println(time);

    }
}
