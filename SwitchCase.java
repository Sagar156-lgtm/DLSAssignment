

package com.bridgelabz.DLS_Assinment_Program;


import java.util.Scanner;

public class SwitchCase {
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter character");
        char characterName=obj.next().charAt(0);



        switch (characterName) {
            case 'a':
                System.out.println("This is vowel" +" " + characterName);
                break;
            case 'e':
                System.out.println("This is vowel: " +" " + characterName);
                break;
            case 'i':
                System.out.println("This is vowel:" +" " + characterName);
                break;
            case 'o':
                System.out.println("This is vowel :" +" " + characterName);
                break;
            case 'u':
                System.out.println("This is a vowel" +" " + characterName);
                break;
            default:
                System.out.println("This is consonant: " +" " + characterName);
        }

    }
}
