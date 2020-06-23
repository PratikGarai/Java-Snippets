package Self_Driven;

//Self_Driven.Linked list implementation
public class Linked
{
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
        Node create(int da)
        {
            Node m = new Node(da);
            this.next = m;
            return m;
        }
        Node getNext()
        {
            return this.next;
        }
    }
    public static void main(String[] args)
    {
        Node head = new Node(1);
        Node last = head;
        for(int i=2;i<=5;i++)
        {
            last = last.create(i);
        }
        last = head;
        for(int i=1;i<=5;i++)
        {
            System.out.println(last.data);
            last = last.getNext();
        }
    }
}