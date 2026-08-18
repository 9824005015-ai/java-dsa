
class DoublyLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head = null;
    void insertBeginning(int data) {
        Node newNode = new Node(data);
   newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }
    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }
    void deleteNode(int data) {
        Node temp = head;

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node not found");
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }
    void displayForward() {
        Node temp = head;

        System.out.print("Forward: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayBackward() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("Backward: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertBeginning(20);
        list.insertBeginning(10);
        list.insertEnd(30);
        list.insertEnd(40);

        list.displayForward();
        list.displayBackward();

        list.deleteNode(30);

        list.displayForward();
        list.displayBackward();
    }
}
