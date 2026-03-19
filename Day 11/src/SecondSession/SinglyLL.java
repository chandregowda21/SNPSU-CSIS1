package SecondSession;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLL {

    Node head = null;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
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

    // Add at specific position
    public void addAtPosition(int data, int pos) {

        Node newNode = new Node(data);

        if (pos == 1) {
            addFirst(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position invalid");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Reverse linked list
    public void reverse() {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // Swap nodes by values
    public void swapNodes(int x, int y) {

        if (x == y)
            return;

        Node prevX = null, currX = head;

        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;

        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null)
            return;

        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;

        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // Delete first node
    public void deleteFirst() {

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        head = head.next;
    }

    // Delete last node
    public void deleteLast() {

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete at specific position
    public void deleteAtPosition(int pos) {

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        if (pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        temp.next = temp.next.next;
    }

    // Check cycle
    public boolean isCyclic() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    // Find middle
    public void findMiddle() {

        if (head == null)
            return;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element: " + slow.data);
    }

    // Split list into two halves
    public void splitAndPrint() {

        if (head == null)
            return;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHead = slow.next;
        slow.next = null;

        System.out.print("First half: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.print("\nSecond half: ");
        temp = secondHead;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Display list
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        SinglyLL list = new SinglyLL();
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(10);
        list.addFirst(5);

        list.addLast(20);
        list.addLast(30);

        list.addAtPosition(15, 3);

        list.display();

        list.deleteFirst();
        list.deleteLast();
        list.deleteAtPosition(3);
        list.display();

        list.reverse();
        list.display();

        list.swapNodes(15, 20);
        list.display();

        list.findMiddle();

        list.splitAndPrint();
    }
}