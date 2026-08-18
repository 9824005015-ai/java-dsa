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
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        Node newNode = new Node(5);

        newNode.next = head;
        newNode.prev = null;

        head.prev = newNode;
        head = newNode;
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
