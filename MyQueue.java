public class MyQueue {
    static int[] queue = new int[20];
    static int f = 0, r = -1;

    public static void main(String[] args) {
        insertQ(10);
        insertQ(20);
        insertQ(30);
        deleteQ();
    }

    public static void insertQ(int ele) {
        int n = queue.length;
        if (r == n - 1) {
            System.out.println("OUEUE OVERFLOW ");
        } else {
            r = r + 1;
            queue[r] = ele;
            System.out.println(ele + " added succesfully ");
        }
    }

    public static void deleteQ() {
        if (f == -1) {
            System.out.println("QUEUE UNDERFLOW ");
        }
        // single element
        else if (f == r) {
            f = -1;
        } else {
            int ele = queue[f];
            System.out.println(ele + " deleted succesfully ");
            f = f + 1;
        }
    }

    // circular queue implementation
    public static void insertCQ(int ele) {
        int n = queue.length;
        if (f == 0 && r == n - 1 || f == (r + 1) % n) {
            System.out.println("QUEUE OVERFLOW ");
        } else if (f == -1 || r == -1) {
            f = 0;
            r = 0;
        } else {
            r = (r + 1) % n;
            queue[r] = ele;
            System.out.println(ele + " added succesfully");
        }
    }

    public static void deleteCQ() {
        int n = queue.length;
        if (f == -1)
            System.out.println("QUEUE UNDERFLOW ");
        else if (f == -1 || r == -1) {
            f = 0;
            r = 0;
        } else {
            f = (f + 1) % n;
        }
    }

    public static boolean isEmpty() {
        if (f == -1)
            return true;
        else
            return false;
    }

    public static boolean isFull() {
        int n = queue.length;
        if (r == n - 1 || f == (r + 1) % n)
            return true;
        else
            return false;
    }

    public static void printElements() {
        System.out.println("ELEMENTS IN QUEUE ARE ");
        while (!isEmpty()) {
            System.out.print(queue[r] + " ");
            r = r + 1;
        }
    }
}
