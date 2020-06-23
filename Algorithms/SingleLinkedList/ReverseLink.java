package Algorithms.SingleLinkedList;

//program to reverse a linked list
public class ReverseLink {
    public static  void main(String[] args)
    {
        Node head = new Node();
        List a = new List();
        a.create(head);
        System.out.println("The list :");
        a.display(head);

        //declarations
        Node first = head.getNext();        //first element
        Node cnode = head;                   //target of replacement
        Node current = first;                   //iterating element

        //processing
        while(current.next!=null)
        {
            if(current.next.next==null)
            {
                cnode.next = current.next;
                cnode = cnode.next;
                cnode.next = first;
                current.next= null;
                current = first;
            }
            else
            {
                current = current.next;
            }
        }

        System.out.println("After reversing");
        a.display(head);
    }
}
