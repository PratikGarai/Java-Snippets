package Algorithms.SingleLinkedList;

class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }

    Node()
    {       //special constructor for head node
        data = 0;
    }
    Node getNext() {
        return next;
    }
}
