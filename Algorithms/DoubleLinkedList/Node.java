package Algorithms.DoubleLinkedList;

class Node {
    private int data;
    Node prev;
    Node next;
    Node(int d)
    {       //only with data
        data = d;
        next= null;
        prev = null;
    }

    Node()
    {       //special constructor for head node
        data =0;
    }

    int getData() {
        return data;
    }

    void insertAfter(Node pre)
    {
        this.prev = pre;
        this.next = pre.next;
        pre.next.prev = this;
        pre.next = this;
    }

    void insertBefore(Node  nex)
    {
        this.next = nex;
        this.prev = nex.prev;
        nex.prev.next = this;
        nex.prev = this;
    }

    void deleteNext()
    {
        if(this.next!=null)
        {
            this.next = this.next.next;
            if(this.next!=null)
            {
                this.next.prev = this;
            }
        }
    }

    void deletePrevious()
    {
        if(this.prev!=null)
        {
            this.prev = this.prev.prev;
            if(this.prev!=null)
            {
                this.prev.next = this;
            }
        }
    }
}