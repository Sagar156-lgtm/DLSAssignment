package com.bridgelabz.DLS_Assinment_Program.Day13;

public class Method1 {

    void maxNumber(Integer x,Integer y,Integer z){
        int max= x;

        if (x.compareTo(y)>0 && x.compareTo(z)>0){
            max = x;
        } else if (y.compareTo(z)>0) {
            max = y;
        }else {
            max = z;
        }

        System.out.println(max);
    }
    public void floatMaxNumber(Float x,Float y,Float z){
        float max = x;

        if (x.compareTo(y)>0 && x.compareTo(z)>0){
            max = x;
        } else if (y.compareTo(z)>0) {
            max = y;
        }else {
            max = z;
        }

        System.out.println(max);
    }

    public void stringMax(String x,String y, String z){
        String max = x;

        if (x.compareTo(y)>0 && x.compareTo(z)>0){
            max = x;
        } else if (y.compareTo(z)>0) {
            max = y;
        }else {
            max = z;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {

        Method1 obj = new Method1();
        obj.maxNumber(12,4,56);


        Method1 obj2 = new Method1();
        obj2.floatMaxNumber(22.4F,9.6F,50.6F);

        Method1 obj3 = new Method1();
        obj3.stringMax("Appledvfdzgfdzgdfv ","fsdgfsdfv","Banana");
    }
}
