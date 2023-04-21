package com.bridgelabz.DLS_Assinment_Program.Day6;

public class Binary {
    public static void main(String[] args) {
        int[] binaryNum = new int[8];
        int i = 0;
        int n = 10;

        int arr[] = new int[binaryNum.length/2];
        int arr2[]=new int[binaryNum.length];
//

        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = binaryNum.length-1; j >= 0; j--) {
            System.out.print(binaryNum[j]);

        }

        System.out.println();

        for (i=0;i<binaryNum.length;i++){
            System.out.print(binaryNum[i]);
        }

//        for (i = 0; i < binaryNum.length/2; i++) {
//            arr[i] = binaryNum[i];
//        }
//        System.out.println("\n" + "First four: ");
//        for (i=0;i< arr.length;i++){
//            System.out.print(arr[i]);
//        }

//        System.out.println("\n" +"First four");
//        for (int k=0;k< binaryNum.length/2;k++) {
//
//            System.out.print(binaryNum[k]);
//
//        }
//        System.out.println("\n" + "Second four");
//        for (int k= binaryNum.length/2+1;k<= binaryNum.length-1;k++){
//
//            System.out.print(binaryNum[k]);
//        }

    }
}
