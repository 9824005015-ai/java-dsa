public class Main {
    static class Node {
        String url;
        Node prev;
        Node next;

        Node(String url) {
            this.url = url;
        }
    }
    static class BrowserHistory {

        Node current;
        BrowserHistory(String homepage) {
            current = new Node(homepage);
        }
        void visit(String url) {
            Node newNode = new Node(url);

            current.next = newNode;
            newNode.prev = current;

            current = newNode;
        }
        String back(int steps) {

            while (steps > 0 && current.prev != null) {
                current = current.prev;
                steps--;
            }

            return current.url;
        }

        String forward(int steps) {

            while (steps > 0 && current.next != null) {
                current = current.next;
                steps--;
            }

            return current.url;
        }
    }
    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory("google.com");

        browser.visit("youtube.com");
        browser.visit("facebook.com");
        browser.visit("twitter.com");

        System.out.println("Back 1: " + browser.back(1));
        System.out.println("Back 1: " + browser.back(1));
        System.out.println("Forward 1: " + browser.forward(1));

        browser.visit("instagram.com");

        System.out.println("Back 2: " + browser.back(2));
        System.out.println("Forward 1: " + browser.forward(1));
    }
}
