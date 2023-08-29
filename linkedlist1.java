
public class linkedlist1 {
    Node head;

    public static void main(String[] args) {
        linkedlist1 l = new linkedlist1();

        l.insertAtPos(10, 1);
        l.insertAtPos(20, 2);
        l.insertAtPos(30, 3);
        // l.insertAtBegin(40);
        // l.insertAtPos(20, 3);
        // l.printNode();
        // Node mid = middle(l.head);
        // System.out.println("MIDDLE ELEMENT = " + mid.data);
        // detectCycle(l.head);
        // System.out.println(isPalindrome(l.head));
        linkedlist1 l2 = new linkedlist1();
        l2.insertAtPos(40, 4);
        l2.insertAtPos(50, 5);
        l2.insertAtPos(60, 6);

        Node result = merge(l.head, l2.head);
        // print result
        Node ptr = result;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }

    }

    // insert node at beginning
    public void insertAtBegin(int newData) {
        Node newNode = new Node(newData);

        newNode.next = head;
        head = newNode;
    }

    // insert node at end
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        newNode.next = null;
        if (head == null) {
            head = new Node(newData);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // insert the node at any position
    public void insertAtPos(int newData, int pos) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = new Node(newData);
            return;
        }
        Node ptr = head;
        int i = 1;
        while (i < pos) {
            ptr = ptr.next;
            i++;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
    }

    // print the node
    public void printNode() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }

    }

    public static Node middle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void detectCycle(Node head) {
        Node slow = head, fast = head;
        int flag = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("CYCLE DETECTED ");
        else
            System.out.println(" NO CYCLE DETECTED ");

    }

    // check palindrome list
    public static boolean isPalindrome(Node head) {
        Node p1 = head;// start of list
        Node p2 = reverse(getRight(head));// take middle of list and reverse the last half list
        while (p1 != null && p2 != null) {
            if (p2.data != p1.data) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        if (head != null && head.next == null)
            return head;
        Node p = head, q = null, r = null;
        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
        return q;
    }

    public static Node getRight(Node head) {
        if (head == null)
            return null;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }

    // merge two linkedlist
    public static Node merge(Node head1, Node head2) {
        Node head = new Node(0);
        Node curr = head, l1 = head1, l2 = head2;
        if (head1 == null)
            return l1;
        if (head2 == null)
            return l2;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else if (l1.data > l2.data) {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 != null)
            curr.next = l1;
        if (l2 != null)
            curr.next = l2;

        return head.next;
    }
}

class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
    }
}
