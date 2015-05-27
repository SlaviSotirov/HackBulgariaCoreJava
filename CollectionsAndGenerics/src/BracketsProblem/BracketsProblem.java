package BracketsProblem;
import java.util.Stack;

public class BracketsProblem {
    public static boolean CheckBrackets(String brackets) {
        Stack<Character> stack = new Stack<Character>();
        for (char element : brackets.toCharArray()) {
            if (element == ('(')) {
                stack.push(element);
            } else if (element == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return true;
    }
}
