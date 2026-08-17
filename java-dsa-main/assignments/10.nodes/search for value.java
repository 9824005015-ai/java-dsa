class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static int search(Node head, int value) {

        Node current = head;
        int position = 0;

        while (current != null) {

            if (current.data == value) {
                return position;
            }

            current = current.next;
            position++;
        }

        return -1; // Value not found
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int value = 30;

        int result = search(head, value);

        if (result != -1) {
            System.out.println(value + " found at position " + result);
        } else {
            System.out.println(value + " not found");
        }
    }
}
