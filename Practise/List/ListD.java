package Practise.List;

import java.util.Scanner;

class ListD {
    private NodeD first, last;
    private NodeD head = new NodeD();
    private void create()
    {
        last = head;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the element");
            NodeD m = new NodeD(in.nextInt());
            last.next = m;
            m.prev = last;
            last = m;
        }
        if(n>0)
        {
            first = this.head.next;
            first.prev= null;
        }
    }
    private void displayForward()
    {
        NodeD m = first;
        while(m!=null)
        {
            System.out.print(m.data + "\t");
            m = m.next;
        }
        System.out.println();
    }
    private void displayBackward()
    {
        NodeD m = last;
        while(m!=null)
        {
            System.out.print(m.data + "\t");
            m = m.prev;
        }
        System.out.println();
    }

    private void insertLast(int k)
    {
        NodeD m = new NodeD(k);
        last.next = m;
        m.prev = last;
        last = m;
    }
    private void insertFirst(int k)
    {
        NodeD m = new NodeD(k);
        head.next = m;
        m.prev= null;
        m.next = first;
        first.prev = m;
        first = m;
    }

    private void insertAfter(NodeD m, int k)
    {
        if(m.next == null)
            insertLast(k);
        else
        {
            NodeD n = new NodeD(k);
            n.next = m.next;
            m.next.prev = n;
            m.next = n;
            n.prev = m;
        }
    }
    private void insertBefore(NodeD m, int k)
    {
        if(m.prev == null)
            insertFirst(k);
        else
        {
            NodeD n = new NodeD(k);
            n.prev =m.prev;
            m.prev.next = n;
            m.prev= n;
            n.next = m;
        }
    }

    private void delete(NodeD m)
    {
        m.prev.next  = m.next;
        m.next.prev = m.prev;
        m.prev = null;
        m.next = null;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ListD a = new ListD();
        a.create();
        System.out.println("Displaying the list forward : ");
        a.displayForward();
        System.out.println("Displaying the list backward");
        a.displayBackward();

        System.out.println();
        System.out.println("Inserting 12 at first position");
        a.insertFirst(12);
        System.out.println("Inserting 10 at last position");
        a.insertLast(10);
        a.displayForward();

        System.out.println();
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println("Inserting input at second position from both ends");
        a.insertAfter(a.first,n);
        a.insertBefore(a.last,n);
        a.displayForward();

        System.out.println();
        System.out.println("Deleting the second element");
        a.delete(a.first.next);
        a.displayForward();

    }
}