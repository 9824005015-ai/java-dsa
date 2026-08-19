Stop copy pasting code you don't actually understand
Build the coding confidence you need to become a developer companies will fight for
Become a PRO
×

Online Java Compiler
Programiz PRO ❯
Main.java

 Run 
2422231920211718151613141011128967
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        ListNode second = head;
        ListNode temp = first;

        while (temp.next != null) {

137public class Main {    static class ListNode {        ListNode(int val) {
Output


Before swapping:
1 -> 2 -> 3 -> 4 -> 5
After swapping:
1 -> 4 -> 3 -> 2 -> 5

=== Code Execution Successful ===
