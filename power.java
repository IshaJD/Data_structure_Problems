public class power {
    public static void main(String[] args) {
        System.out.println(pow1(3, 5));
        System.out.println(pow2(3, 5));
    }

    // approach 1
    public static int pow1(int a, int b) {
        // base case
        if (b == 0)
            return 1;
        else
            return a * pow1(a, b - 1);
    }// approach 2

    public static int pow2(int a, int b) {
        int result = 0, finalresult = 0;
        if (b == 1)
            return a;
        else {
            result = pow2(a, b / 2);
            finalresult = result * result;
            if (b % 2 == 0) {
                return finalresult;
            } else {
                return a * finalresult;
            }

        }
    }
}
