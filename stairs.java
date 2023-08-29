public class stairs {
    public static void main(String[] args) {
        // call the function for n+1 times instead of n same as in fibo function
        int n = 4;
        System.out.println(stair(n + 1));
    }

    public static int stair(int n) {
        if (n <= 1) {
            return n;
        } else {
            return stair(n - 1) + stair(n - 2);
        }
    }
}
