public class linkedlist {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Manually create nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);


        head.next = second;
        second.next = third;


        Node current = head;
        System.out.print("Linked List: ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
