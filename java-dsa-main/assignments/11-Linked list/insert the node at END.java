class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(30);

        Node second = new Node(44);
        head.next = second;
        second.prev = head;

        Node third = new Node(50);
        second.next = third;
        third.prev = second;
        Node newNode = new Node(40);

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
