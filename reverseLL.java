
public class reverseLL {
    static ListNode head;

    public static void main(String[] args) {
        insertAtPos(10, 1);
        insertAtPos(20, 2);
        insertAtPos(30, 3);
        insertAtPos(40, 4);
        // reverse(head);
        // rReverse(null, head);
        // printNode();
        // System.out.println(binToint(head));
        ListNode result = rotate(head, 1);
        ListNode ptr = result;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }

    }

    // convert binary to integer
    public static int binToint(ListNode head) {

        if (head == null)
            return 0;
        int sum = head.data;
        head = head.next;
        ListNode ptr = head;
        while (ptr != null) {
            sum *= 2;
            sum = sum + ptr.data;
            ptr = ptr.next;
        }
        return sum;

    }

    // rotate LinkedList
    public static ListNode rotate(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode ptr = head;
        int len = 0;
        while (ptr.next != null) {
            ptr = ptr.next;
            len++;
        }
        // connect it to make cycle
        ptr.next = head;
        k = k % len;
        for (int i = 0; i < len - k; i++) {
            ptr = ptr.next;
        }
        head = ptr.next;
        ptr.next = null;
        return head;
    }

    // print
    public static void printNode() {
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }

    // insert
    public static void insertAtPos(int newData, int pos) {
        ListNode newNode = new ListNode(newData);

        if (head == null) {
            head = new ListNode(newData);
            return;
        }
        ListNode ptr = head;
        int i = 1;
        while (i < pos && ptr.next != null) {
            ptr = ptr.next;
            i++;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
    }

    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head != null && head.next == null)
            return head;

        ListNode p = head, q = null, r = null;
        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
        return q;
    }

    public static void rReverse(ListNode q, ListNode p) {
        if (p != null) {
            rReverse(p, p.next);
            p.next = q;
        } else {
            head = q;
        }
    }
}

class ListNode {
    int data;
    ListNode next;

    ListNode(int newData) {
        data = newData;
    }
}
