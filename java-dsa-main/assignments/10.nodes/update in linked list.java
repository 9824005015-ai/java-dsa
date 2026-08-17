class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    static void update(Node head, int oldValue, int newValue) {

        Node current = head;

        while (current != null) {

            if (current.data == oldValue) {
                current.data = newValue;
                return;
            }

            current = current.next;
        }

        System.out.println("Value not found");
    }

    static void display(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Before update:");
        display(head);

        update(head, 20, 25);

        System.out.println("After update:");
        display(head);
    }
}
