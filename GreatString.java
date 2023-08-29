import java.util.Stack;

public class GreatString {
    public static void main(String[] args) {
        String str = "leEeetcode";
        System.out.println(makeStringGreat(str));
    }

    public static String makeStringGreat(String str) {
        if (str == null || str.length() == 0) {
            return " ";
        }
        char[] s = str.toCharArray();
        Stack<Character> sq = new Stack<>();
        for (Character character : s) {
            // if top character is small or capital of current char then remove it
            if (!sq.isEmpty() && (Math.abs(sq.peek() - character) == 32)) {
                sq.pop();
            } else {
                sq.push(character);
            }
        }
        char[] res = new char[sq.size()];
        int i = sq.size() - 1;
        while (!sq.isEmpty()) {
            res[i--] = sq.pop();

        }
        return new String(res);
    }
}