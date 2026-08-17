class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static Node deleteLast(Node head) {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

        return head;
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

        System.out.println("Before deletion:");
        display(head);

        head = deleteLast(head);

        System.out.println("After deleting last node:");
        display(head);
    }
}
