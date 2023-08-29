import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("postfix = " + infixToPostfix(str));
    }

    public static String infixToPostfix(String str) {
        if (str == null || str.length() == 0)
            return " ";
        String result = new String(" ");
        Stack<Character> stack = new Stack<>();
        // start scanning from left to right
        for (int i = 0; i < str.length(); i++) {
            // if scanned char is operand
            char curr = str.charAt(i);
            if (Character.isLetterOrDigit(curr)) {
                result += curr;
            }
            // if it is opening bracket add it to result
            if (curr == '(') {
                result += curr;
            }
            // if it is closing bracket push it in the stack
            if (curr == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
                stack.pop();
            } else {
                // operator is there
                while (!stack.isEmpty() && prec(curr) < prec(stack.peek())) {
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(curr);
            }
        }
        return result;
    }

    public static int prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }
}
