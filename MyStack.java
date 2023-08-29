
public class MyStack {
    static int stack[] = new int[100];
    static int n = stack.length;
    static int top = -1;

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        // getElements();
        pop();
        peek();
    }

    public static void push(int element) {
        if (top == n - 1) {
            System.out.println("OVERFLOW CONDITION ");
        } else {
            top = top + 1;
            stack[top] = element;
            System.out.println(element + " added successfully ");
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY ");
        } else {
            int ele = stack[top];
            System.out.println(ele + " popped out");
            top = top - 1;

        }
    }

    public static void peek() {
        if (!isEmpty())
            System.out.println("ELEMENT AT TOP IS " + stack[top]);
    }

    public static void search(int element) {

    }

    public static boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public static boolean isFull() {
        if (top == n)
            return true;
        else
            return false;
    }

    public static void getElements() {
        if (isEmpty())
            System.out.println("UNDERFLOW CONDITION ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }
}
