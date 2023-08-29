import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        String s = "{(([])}}";
        System.out.println(isValidParenthesis(s));

    }

    public static boolean isValidParenthesis(String str) {
        char[] ch = str.toCharArray();
        Stack<Character> s = new Stack<>();
        // pushing open brackets
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[') {
                s.push(ch[i]);
                continue;
            } else if (s.empty())
                return false;
            char top = s.pop();
            if (top == '{' && ch[i] != '}')
                return false;
            else if (top == '(' && ch[i] != ')')
                return false;
            else if (top == '[' && ch[i] != ']')
                return false;
        }
        return (s.empty() == true);
    }
}
