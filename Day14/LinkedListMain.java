package com.bridgelabz.DLS_Assinment_Program.Day14;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();

        System.out.println(linkedList2.search(30));


        Integer poppedElement = linkedList1.pop();
        System.out.println("Popped Element => " + poppedElement);
        linkedList1.display();

        Integer popLastElement = linkedList1.popLast();
        System.out.println(popLastElement);
        linkedList1.display();

        boolean isInserted = linkedList2.insertAfter(30,40);
        System.out.println(isInserted);
        linkedList2.display();
    }
}
