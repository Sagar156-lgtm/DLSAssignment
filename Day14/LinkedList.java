package com.bridgelabz.DLS_Assinment_Program.Day14;

public class LinkedList<T>{
    Node<T> head;
    Node<T> tail;

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else {
            newNode.next = head;
            head = newNode;

        }
    }

    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else {
            tail.next= newNode;
            tail = newNode;
        }
    }

    public Node<T> search(T data){
        Node<T> temp =head;
        while (temp!=null){
            if(temp.data==data){ // if(temp.data.equals(data))

                return temp;
            }
            temp=temp.next;
        }
        return null;
    }



    public void display(){
            Node<T> temp = head;
            while (temp!=null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        System.out.println();
    }

    public T pop() {
        T popData = head.data;
        head = head.next;
        return popData;
    }

    public T popLast() {
        T data = tail.data;
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return data;
    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null){
            Node<T> temp = searchedNode.next;
            searchedNode.next = newNode;
            newNode.next = temp;
            return true;
        }
        return false;
    }

}
