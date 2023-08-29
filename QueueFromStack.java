import java.util.Stack;

public class QueueFromStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        System.out.println(s1);
        delete();
        System.out.println(s2);
    }

    public static int delete() {
        // add new data to s1
        // pop from s1 and push to s2
        // pop from s2 to get queue like ELEMENTS
        if (s1.empty() && s2.empty()) {
            System.out.println("QUEUE UNDERFLOW ");
            System.exit(0);
        }
        int ele = 0;
        if (s2.empty()) {
            while (!s1.isEmpty()) {
                ele = s1.pop();
                s2.push(ele);

            }
        }
        // return element
        ele = s2.pop();
        return ele;

    }

    public static void insert(int data) {
        s1.push(data);
    }
}
