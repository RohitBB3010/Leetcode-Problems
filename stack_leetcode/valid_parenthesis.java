import java.util.Stack;

public class valid_parenthesis {

    public boolean isValid(String s){

        if(s.length() == 0) return true;
        if(s.length() == 1) return false;

        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '['  || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) return false;
                else{
                    char popped = stack.pop();
                    if(s.charAt(i) == '}' && popped != '{') return false;
                    if(s.charAt(i) == ']' && popped != '[') return false;
                    if(s.charAt(i) == ')' && popped != '(') return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
