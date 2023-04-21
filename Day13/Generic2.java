package com.bridgelabz.DLS_Assinment_Program.Day13;

public class Generic2<T extends Comparable> {
        T x,y,z;
        public static  <T extends Comparable> void textMaximum(T x,T y,T z){

            T max=x;

            if (x.compareTo(y)>0 && x.compareTo(z)>0){
                max = x;
            } else if (y.compareTo(z)>0) {
                max = y;
            }else {
                max = z;
            }

            System.out.println(max);
        }

        public <T extends Comparable> void Maximum(T x,T y,T z){
           Generic generic2 = new Generic();
            generic2.textMaximum(x,y,z);
        }

        public static <T extends Comparable<T>> T Maximum2(T... elements) {
            T max = elements[0];
            for (T element : elements) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
            return max;
        }

        public static void main(String[] args) {
            Generic generic = new Generic();
           // generic.Maximum(12,23,45);//non-static method
            System.out.println(Maximum2(12,100,23,24,45));// Generic method

        }
}
