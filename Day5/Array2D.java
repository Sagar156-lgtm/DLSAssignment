package com.bridgelabz.DLS_Assinment_Program.Day5;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the M: ");
        int M= obj.nextInt();
        System.out.println("Enter the N:");
        int N= obj.nextInt();

        int[][] arr=new int[M][N];
        arr[0][0]=11;

       // PrintWriter obj2=new PrintWriter();

        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                System.out.println(arr[i][j]);
               // obj2.print(arr[i][j]);
            }
        }

    }
}
