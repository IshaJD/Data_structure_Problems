import java.util.LinkedList;

public class mergeLL {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(30);
        l1.add(50);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(20);
        l2.add(60);
        l2.add(40);

    }

    public static Node merge(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        Node head = new Node(0);
        Node curr = head, l1 = head1, l2 = head2;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else if (l1.data > l2.data) {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
            if (l1 != null)
                curr.next = l1;
            if (l2 != null)
                curr.next = l2;
        }
        return head.next;
    }

    // public static Node intersection2(Node head1, Node head2) {
    // if (head1 == null && head2 == null)
    // return null;
    // Node l1 = head1, l2 = head2;
    // int count1 = 0, count2 = 0;
    // while (l1 != null) {
    // l1 = l1.next;
    // count1++;
    // }
    // while (l2 != null) {
    // l2 = l2.next;
    // count2++;
    // }

    // }
    public static Node intersection1(Node head1, Node head2) {
        if (head1 == null && head2 == null)
            return null;
        Node a = head1, b = head2;
        while (a != b) {
            if (a == null)
                a = head2;
            else
                head1 = head1.next;
            if (b == null)
                b = head1;
            else
                head2 = head2.next;
        }
        return a;
    }
}
