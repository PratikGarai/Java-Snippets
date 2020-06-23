package Algorithms.SingleLinkedList;

import java.util.Scanner;

class List {
    Node last;
    void create(Node head)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        last = head;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the element");
            Node a = new Node(in.nextInt());
            last.next = a;
            last = a;
        }
    }
    void display(Node head)
    {
        Node next;
        if(head.next!=null) {
            next = head.next;
        }
        else {
            next = head;
        }
        while(next!=null)
        {
            System.out.println(next.data);
            next = next.next;
        }
    }
    void InsertLast(Node d)
    {
        last.next = d;
        last = d;
    }
}