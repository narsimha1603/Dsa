class LinkedList
{
    Node head;
    Node tail;
    int size=0;
    class Node
    {
        int value;
        Node next;
        Node(int value)
        {
           this.value = value; 
        }
        Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
    //insert at the first of the list
    void insertfirst(int value)
    {
        Node node=new Node(value);
        node.next=head;
        //head initialization
        head=node;
        //tail initialization
        if(tail==null)
        {
            tail=head;
        }
        //size increment
        size++;
    }
    // insert at the last of the list
    void insertlast(int value)
    {
        if(tail==null)
        {
            insertfirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }
    // insert at a specific index of the list
    void insert(int value,int index)
    {
        if(index==0)
        {
            insertfirst(value);
            return;
        }
        if(index==size)
        {
            insertlast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    //Display the list
    void display()
    {
        Node temp=head;//temp is a pointer to the head of the list and will be used to traverse the list
        //traverse the list until temp is null
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;//temp moves to the next node to display the value of the next node
        }
        System.out.println("null");
    }
}