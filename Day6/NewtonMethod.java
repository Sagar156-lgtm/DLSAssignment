package com.bridgelabz.DLS_Assinment_Program.Day6;

public class NewtonMethod {
    static int c=5;
    static int t=c;
    public static void main(String[] args) {

        int avrt=(c/t+t)/2;
        float e=2.718F;
        double epsilon=1*e-15;

        if (Math.abs(t-c/t)>epsilon*t){
            System.out.println("Max accuracy: " + Math.abs(t-c/t));
        }

    }
}
