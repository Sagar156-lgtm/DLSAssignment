package com.bridgelabz.DLS_Assinment_Program.Day8_2;

public class Main {
    public static void main(String []args){
        Line l1=new Line();
        l1.ep1=new Point();
        l1.ep1.x=1;
        l1.ep1.y=2;

        l1.ep2=new Point();
        l1.ep2.x=10;
        l1.ep2.y=20;


        Float length1 = l1.calculateLength();
        System.out.println("Length1 = "+length1);

      //  String str1=String.valueOf(length1);

        Line l2=new Line();
        l2.ep1=new Point();
        l2.ep1.x=2;
        l2.ep1.y=4;

        l2.ep2=new Point();
        l2.ep2.x=20;
        l2.ep2.y=40;

        Float length2 = l2.calculateLength();
        System.out.println("Length2 = "+length2);



        System.out.println(length1 + " .equals " + length2
                + ": " + length1.equals(length2));
        System.out.println("Both line are equal: ");

        //*************** OR *******************

        System.out.println(length1 + ".CompareTo" + length2 + ": " + length1.compareTo(length2));

        if(length1.compareTo(length2)==0){
            System.out.println("Both are equal");

        } else if (length1.compareTo(length2)==1) {
            System.out.println("L1 is greater than L2");
        }
        else {
            System.out.println("L2 is greater than L1:");
        }


    }
}
