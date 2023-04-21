package com.bridgelabz.DLS_Assinment_Program.Day13;

public class Method2 {

    public static <T extends Comparable<T>> T max(T... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Integer Max: " + max(32,56,89));

        System.out.println("Float max: " + max(40.6F,9.9F,60.7F));

        System.out.println("Integer max for more than 3 element: " + max(12,33,23,12,67));

      //  System.out.println("String Max: " + max("Apple", "orange", "Bananasdjsdfb"));

    }
}
