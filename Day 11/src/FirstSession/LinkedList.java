package FirstSession;

class Node1{
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    static Node head = null;

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

        if (position == 1) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
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

    // Reverse linked list
    public void reverse() {

        Node prev = null;
        Node cur = head;
        Node next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        head = prev;
    }

    // Count nodes
    public int countNode() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Floyd Cycle Detection
    public boolean hasCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Swap two nodes by value
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

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);

        System.out.println("Linked List:");
        ll.display();

        System.out.println("Node Count: " + ll.countNode());

        ll.swapNodes(20, 40);
        System.out.println("After Swapping 20 and 40:");
        ll.display();

        ll.reverse();
        System.out.println("Reversed List:");
        ll.display();

        if (ll.hasCycle()) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle");
        }
        ll.swapNodes(30,40);
        ll.display();
    }
}