
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Del_Middle_Node {

    public Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node temp = null;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        // build linked list manually instead of LinkedList<Integer>
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Del_Middle_Node sol = new Del_Middle_Node();
        head = sol.deleteMiddle(head);

        // print result
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}