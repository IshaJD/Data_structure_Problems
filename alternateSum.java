public class alternateSum {
    public static void main(String[] args) {
        System.out.println(altSum(10));
    }

    public static int altSum(int n) {
        if (n == 0)
            return 0;

        if (n % 2 == 0)
            return altSum(n - 1) - n;
        else
            return altSum(n - 1) + n;

    }
}
