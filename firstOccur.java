import java.util.HashMap;

public class firstOccur {
    public static void main(String[] args) {
        String s = "priyaPr";
        System.out.println(findFirstOccur(s));
    }

    public static char findFirstOccur(String str) {
        char[] ch = str.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (!hm.containsKey(ch[i]))
                hm.put(ch[i], 1);
            else {
                int value = hm.get(ch[i]);
                hm.put(ch[i], value + 1);
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if (hm.get(ch[i]) == 1)
                return ch[i];
        }
        return ' ';
    }
}
