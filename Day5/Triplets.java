package com.bridgelabz.DLS_Assinment_Program.Day5;

import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int[] arr={1,0,-1,3,2,-2,5};


        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                for (int k=0;k< arr.length;k++){
                    if (arr[i] + arr[j] +arr[k] ==0){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }
}
