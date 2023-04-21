package com.bridgelabz.DLS_Assinment_Program.Day5;

public class LargestAmongThreeNumber {
    public static void main(String[] args) {
        int x=45;
        int y=87;
        int z=13;

        if (x>y &&x>z){
            System.out.println("X is grater than y,z: " + x);
        } else if (y>x && y>z) {
            System.out.println("Y is grater than x, y: " + y);
        }
        else {
            System.out.println("Z is grater than x,y: "  + z);
        }
    }
}
