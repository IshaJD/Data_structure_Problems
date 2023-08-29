public class printMult {
    public static void main(String[] args) {
        printMul(24, 5);
    }

    public static void printMul(int n, int k) {

        // base condition
        if (k == 1) {
            System.out.println(n);
            return;
        }
        printMul(n, k - 1);
        System.out.print(n * k + " ");

    }
}
