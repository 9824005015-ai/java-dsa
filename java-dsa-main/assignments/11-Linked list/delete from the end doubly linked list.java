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
        head.next = second;
        second.prev = head;

        Node third = new Node(30);
        second.next = third;
        third.prev = second;

        Node fourth = new Node(40);
        third.next = fourth;
        fourth.prev = third;
        if (head == null) {
            System.out.println("List is empty");
        } 
        else if (head.next == null) {
            head = null;
        } 
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
