public class gcd {
    public static void main(String[] args) {
        System.out.println(GCd(16, 20));
    }

    public static int GCd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > b)
            return GCd(b, a % b);
        else
            return GCd(a, b % a);
    }
}
