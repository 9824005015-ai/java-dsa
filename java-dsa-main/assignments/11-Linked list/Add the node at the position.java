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
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        int position = 3;
        Node newNode = new Node(25);

        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
