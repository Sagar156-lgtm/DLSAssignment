package com.bridgelabz.DLS_Assinment_Program.Day9;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactPerson {

    Contact obj=new Contact();
    public void ContactDetails(){


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first name: ");
        obj.setFirstName(sc.next());

        System.out.println("Enter the last name: ");
        obj.setLastName(sc.next());

        System.out.println("Enter address: ");
        obj.setAddress(sc.next());

        System.out.println("Enter city name: ");
        obj.setCity(sc.next());

        System.out.println("Enter state name: ");
        obj.setState(sc.next());

        System.out.println("Enter your postal code: ");
        obj.setZip(sc.nextInt());

        System.out.println("Enter contact number: ");
        obj.setNumber(sc.nextLong());

        System.out.println("Enter your email id: ");
        obj.setEmailId(sc.next());


        System.out.println("Edit person detail: ");
        System.out.println("1: Edit:");
        System.out.println("2: Delete");
        System.out.println("3 Display:");
        System.out.println("Choose the option: ");


        int d= sc.nextInt();
        switch (d){
            case 1:
            System.out.println("What you want to edit: ");
            System.out.println("1: Edit name: ");
            System.out.println("2: Edit address: ");
            System.out.println("3: Edit contact: ");
            System.out.println("4: Edit email: ");
            int choice= sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("first name: ");
                    obj.setFirstName(sc.next());
                    System.out.println("last name:");
                    obj.setLastName(sc.next());
                    break;
                case 2:
                    System.out.println("Enter address: ");
                    obj.setAddress(sc.next());

                    System.out.println("Enter city name: ");
                    obj.setCity(sc.next());

                    System.out.println("Enter state name: ");
                    obj.setState(sc.next());
                    break;
                case 3:

                    System.out.println("Enter contact number: ");
                    obj.setNumber(sc.nextLong());
                    break;
                case 4:
                    System.out.println("Enter your email id: ");
                    obj.setEmailId(sc.next());
                    break;
                default:
                    System.out.println("Choose correct option: ");

            }
            break;
            case 2:
                delete();
                break;
            case 3:
                display();
                break;


        }

    }
    public void delete(){
        obj=null;
        System.out.println("Deleted contact " + obj);
    }
    public void display(){
        System.out.println(obj);
    }

}