package FirstSession;


public class Joseph{

    Node head = null;

    // Step 2: Function to insert nodes at the end
    public void addLast(int data) {
        Node newNode = new Node(data);

        // If list is empty make new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link last node to new node
        temp.next = newNode;
    }

    // Step 3: Function to solve Josephus problem
    public void josephus(int k) {

        // If list is empty return
        if (head == null)
            return;

        // Convert list into circular linked list
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;

        // Initialize pointers
        Node prev = temp;
        Node curr = head;

        // Continue until only one node remains
        while (curr.next != curr) {

            // Move k-1 steps
            for (int i = 1; i < k; i++) {
                prev = curr;
                curr = curr.next;
            }

            // Remove k-th node
            System.out.println("Eliminated: " + curr.data);
            prev.next = curr.next;

            // Move to next node
            curr = prev.next;
        }

        // Last remaining node
        System.out.println("Survivor: " + curr.data);
    }

    // Step 4: Main method
    public static void main(String[] args) {

        Joseph list = new Joseph();

        // Create list 1 2 3 4 5
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        // Solve Josephus problem with k = 2
        list.josephus(2);
    }
}