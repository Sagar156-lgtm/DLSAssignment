package com.bridgelabz.DLS_Assinment_Program;

public class EqualString {
    public static void main(String [] args){



        String string1 = new String("Sagar");
        String string2 = new String("Sagar");


        String string3 = new String("Pratap");
        String string4 = new String("Singh");

        System.out.println("Comparing " + string1 + " and " + string2
                + " : " + string1.equals(string2));

        System.out.println("Comparing " + string3 + " and " + string4
                + " : " + string3.equals(string4));

    }
}
