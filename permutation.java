public class permutation {
    public static void main(String[] args) {
        String s = "abc";
        permut1(s.toCharArray(), 0);
    }

    public static void permut1(char[] s, int fix) {
        if (fix == s.length - 1) {
            System.out.print(s);
            System.out.println();
            return;
        }

        for (int i = fix; i < s.length; i++) {
            swap(s, fix, i);
            permut1(s, fix + 1);
            swap(s, fix, i);
        }

    }

    public static void swap(char[] s, int c, int d) {
        char temp = s[c];
        s[c] = s[d];
        s[d] = temp;
    }
}
