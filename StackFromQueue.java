import java.util.LinkedList;
import java.util.Queue;

public class StackFromQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void main(String[] args) {
        // we need two queues
        insert(10);
        insert(20);
        insert(30);
        System.out.println(q1);
        delete();
        System.out.println(q1);
    }

    public static void insert(int data) {
        // move q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
        }
        // add new data to q1
        q1.add(data);
        // move data from q2 to q1
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll();
        }

    }

    public static int delete() {
        // peek first element
        if (q1.isEmpty()) {
            System.out.println(" STACK UNDERFLOW ");
            System.exit(0);
        }
        int ele = q1.peek();
        q1.poll();
        return ele;
    }
}
