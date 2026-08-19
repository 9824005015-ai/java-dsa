import java.util.Random;

public class Main {
    static class Skiplist {
        static final int MAX_LEVEL = 4;
        class Node {
            int value;
            Node[] next;
            Node(int value, int level) {
                this.value = value;
                this.next = new Node[level];
            }
        }
        Node head = new Node(-1, MAX_LEVEL);
        int level = 1;
        Random random = new Random();
        int getLevel() {
            int lvl = 1;

            while (random.nextBoolean() && lvl < MAX_LEVEL) {
                lvl++;
            }
            return lvl;
        }
        boolean search(int target) {

            Node current = head;

            for (int i = level - 1; i >= 0; i--) {

                while (current.next[i] != null &&
                       current.next[i].value < target) {
                    current = current.next[i];
                }
            }
            current = current.next[0];

            return current != null && current.value == target;
        }
        void add(int num) {

            Node[] update = new Node[MAX_LEVEL];
            Node current = head;

            for (int i = level - 1; i >= 0; i--) {

                while (current.next[i] != null &&
                       current.next[i].value < num) {
                    current = current.next[i];
                }

                update[i] = current;
            }

            int newLevel = getLevel();

            if (newLevel > level) {
                for (int i = level; i < newLevel; i++) {
                    update[i] = head;
                }

                level = newLevel;
            }

            Node newNode = new Node(num, newLevel);

            for (int i = 0; i < newLevel; i++) {
                newNode.next[i] = update[i].next[i];
                update[i].next[i] = newNode;
            }
        }
        boolean erase(int num) {

            Node[] update = new Node[MAX_LEVEL];
            Node current = head;

            for (int i = level - 1; i >= 0; i--) {
                while (current.next[i] != null &&
                       current.next[i].value < num) {
                    current = current.next[i];
                }

                update[i] = current;
            }
            current = current.next[0];

            if (current == null || current.value != num) {
                return false;
            }
            for (int i = 0; i < level; i++) {

                if (update[i].next[i] == current) {
                    update[i].next[i] = current.next[i];
                }
            }

            return true;
        }
    }
    public static void main(String[] args) {

        Skiplist list = new Skiplist();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Search 2: " + list.search(2));
        list.add(4);
        System.out.println("Search 4: " + list.search(4));
        System.out.println("Erase 2: " + list.erase(2));
        System.out.println("Search 2: " + list.search(2));
    }
}

