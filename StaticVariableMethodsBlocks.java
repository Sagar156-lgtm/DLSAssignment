package com.bridgelabz.DLS_Assinment_Program;

public class StaticVariableMethodsBlocks {
    static int a=m1();
    static int x=15;

    static int m1(){
        System.out.println("This is static method");
        return 20;

    }
    public static void main(String []args){


        System.out.println("Value of a: " + a);
    }
}
