package com.bridgelabz.DLS_Assinment_Program.Day8_2;


public class Line {
    Point ep1;
    Point ep2;
    float calculateLength(){
        //  return (float) Math.sqrt((ep1.x-ep2.x)*(ep1.x-ep2.x) + (ep1.y-ep2.y)*(ep1.y-ep2.y)) ;

        return (float) Math.sqrt(Math.pow(ep1.x-ep2.x,2) + Math.pow(ep1.y-ep2.y,2));
    }
}
