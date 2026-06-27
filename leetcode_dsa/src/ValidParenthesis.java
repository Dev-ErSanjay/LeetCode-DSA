import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s) {

        if (s == null || s.length() == 0)
            return true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(')
                stack.push(ch);
            else if (stack.isEmpty())
                return false;
            else if (ch == ']' && stack.peek() == '[')
                stack.pop();
            else if (ch == '}' && stack.peek() == '{')
                stack.pop();
            else if (ch == ')' && stack.peek() == '(')
                stack.pop();
            else
                return false;
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {

        String str = "[([])]";
        System.out.println(isValid(str));
    }
}