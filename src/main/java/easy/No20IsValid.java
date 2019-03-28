package easy;

import java.util.Stack;

public class No20IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if (isLeft(temp)){
                stack.push(temp);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char left = stack.pop();
                if (!isPair(left, temp)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeft(char c){
        switch (c){
            case '(':
            case '[':
            case '{':
                return true;
            default:
                return false;
        }
    }

    private boolean isPair(char left, char right){
        switch (left){
            case '(':
                return right == ')';
            case '[':
                return right == ']';
            case '{':
                return right == '}';
            default:
                return false;
        }
    }
}
