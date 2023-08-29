public class deletion {
    Node head;

    public static void main(String[] args) {
        deletion d = new deletion();
        d.insertAtPos(10, 1);
        d.insertAtPos(20, 2);
        d.insertAtPos(30, 3);
        d.delete(2);
        d.printNode();
    }

    // print
    public void printNode() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }

    // insert
    public void insertAtPos(int newData, int pos) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = new Node(newData);
            return;
        }
        Node ptr = head;
        int i = 1;
        while (i < pos && ptr.next != null) {
            ptr = ptr.next;
            i++;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
    }

    public void delete(int pos) {
        // if only one node
        if (pos == 1) {
            head = head.next;
            return;
        }
        //
        Node ptr = head;
        Node prev = null;
        int i = 1;
        while (i < pos) {
            prev = ptr;
            ptr = ptr.next;
            i++;
        }
        prev.next = ptr.next;
    }

}

class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
    }
}