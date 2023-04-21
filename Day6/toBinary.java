package com.bridgelabz.DLS_Assinment_Program.Day6;

public class toBinary {
    public static void main(String[] args) {
        int[] binaryNum = new int[16];
        int i=0;
        int n=12;
        //long x=000000000001;

       while (n>0){
           binaryNum[i] = n % 2;
           n = n / 2;
           i++;
       }
        for (int j = i - 1; j >= 0; j--){
            System.out.print(binaryNum[j]);
    }
    }
}
