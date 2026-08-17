class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static Node insertAtPosition(Node head, int data, int position) {

        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;

        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position is invalid");
                return head;
            }
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position is invalid");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;

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

        System.out.println("Before insertion:");
        display(head);
        head = insertAtPosition(head, 25, 2);

        System.out.println("After insertion:");
        display(head);
    }
}
