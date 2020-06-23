package LinkedList_Generic;

import java.util.Scanner;

public class LinkedList_Generic_Driver
{
    private Node last = new Node(" ");
    private Node reader_last = last;
    private void Creation()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many elements?");
        int c = in.nextInt();
        in.nextLine();
        for(int i=1; i<=c; i++)
        {
                System.out.println("Enter "+i+" th data");
                String m = in.nextLine();
                Node z = new Node(m);
                last.setNext(z);
                last = z;
        }
        System.out.println("Enter the int");
        int m = in.nextInt();
        Node z = new Node(m);
        last.setNext(z);
        last = z;
    }
    private void Reading()
    {
        while (true)
        {
            System.out.println(reader_last.data);
            reader_last = reader_last.next;
            if(reader_last==null)
                    break;
        }
    }
    public static void main(String[] args)
    {
        LinkedList_Generic_Driver ob = new LinkedList_Generic_Driver();
         ob.Creation();
         ob.Reading();
    }
}
