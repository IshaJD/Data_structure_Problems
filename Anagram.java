import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str[] = { "eat", "nat", "ten", "bat", "ate" };
        ArrayList<String> ans = groupAnagram(str);
        System.out.println(ans);
    }

    public static ArrayList<String> groupAnagram(String[] str) {
        if (str == null || str.length == 0)
            return new ArrayList<>();
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for (String ch : str) {
            // change each string to char Array and sort it

            char c[] = ch.toCharArray();
            Arrays.sort(c);
            String newc = String.valueOf(c);
            // check if that str is already present add it to the list otherwise make new
            // one
            if (!hm.containsKey(newc))
                hm.put(newc, new ArrayList<>());
            hm.get(newc).add(ch);
        }
        return new ArrayList(hm.values());
    }
}
