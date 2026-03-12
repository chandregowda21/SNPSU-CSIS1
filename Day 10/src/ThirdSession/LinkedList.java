package ThirdSession;

import javax.xml.stream.events.EndDocument;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    Node head = null;

    // Add at last
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at position
    public void addAtPosi(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            addFirst(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    //reverse
    public void Reverse(){
        Node prev=null;
        Node cur=head;
        Node next=null;
        while (cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
    }

    //count
    public int countNode(){
        int count=0;
        Node temp = head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);

        ll.display();

  //
        ll.Reverse();
        ll.display();
    }
}