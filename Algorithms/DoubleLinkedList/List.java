package Algorithms.DoubleLinkedList;

import java.util.Scanner;

class List {
    Node first,last;
    void create( Node head)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        last = head;
        for(int i = 1;i<=n;i++)
        {
            System.out.println("Enter the element");
            Node nw = new Node(in.nextInt());
            last.next = nw;
            nw.prev = last;
            last = nw;
        }
        if(n>0)
        {
            first = head.next;
            first.prev = null;
        }
    }

    void display()
    {
        Node n = first;
        while(n!=null)
        {
            System.out.println(n.getData());
            n = n.next;
        }
    }

    void displayBackwards()
    {
        Node n = last;
        while(n!=null)
        {
            System.out.println(n.getData());
            n= n.prev;
        }
    }
}
