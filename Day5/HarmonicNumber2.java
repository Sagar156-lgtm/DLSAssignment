package com.bridgelabz.DLS_Assinment_Program.Day5;

public class HarmonicNumber2 {
    float sum(float n)
    {
        if (n < 2)
            return 1;
        else
            return 1 / n + (sum(n - 1));
    }


    public static void main(String args[])
    {
        HarmonicNumber2 g = new HarmonicNumber2();
        System.out.println(g.sum(8));
        System.out.print(g.sum(10));
    }
}
