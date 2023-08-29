public class fourthPower {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPower(num));
    }

    public static boolean isPower(int num) {
        if (num == 1)
            return true;
        if (num % 4 != 0 || num <= 0)
            return false;
        return isPower(num / 4);
    }
}
