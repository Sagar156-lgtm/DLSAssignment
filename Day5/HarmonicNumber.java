package com.bridgelabz.DLS_Assinment_Program.Day5;

public class HarmonicNumber {
    public static void main(String[] args) {
        int N=7;
        double result = 0.0;
        while (N>0){
            result = result + (double)1 / N;
            N--;
            System.out.print(result + ", ");
        }
    }
}
