package LinkedList_Generic;

public class Node<T> {
    T data;
    Node next;
    Node(T d)
    {
        data = d;
        next = null;
    }
    void setNext(Node b)
    {
        this.next = b;
    }
    void deleteNext()
    {
        this.next = this.next.next;
    }
}