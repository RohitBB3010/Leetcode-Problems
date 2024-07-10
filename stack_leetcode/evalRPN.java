import java.util.Stack;

public class evalRPN {

    public static int evalRPN(String[] tokens){
        int result = 0;

        if(tokens.length == 1) return isNumber(tokens[0]) ?  Integer.parseInt(tokens[0]) : 0;

        Stack<Integer> stack = new Stack();

        stack.push(Integer.parseInt(tokens[0]));
        stack.push(Integer.parseInt(tokens[1]));

        for(int i = 2; i < tokens.length; i++){
            if(!isNumber(tokens[i])){
                int a = stack.pop();
                int b = stack.pop();

                int currentResult = doOperation(a, b, tokens[i]);
                stack.push(currentResult);
            } else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.peek();
    }

    static int doOperation(int a, int b, String operator){
        int resultOp = 0;
        switch (operator){
            case "+":
                resultOp = a + b;
                break;

            case "*":
                resultOp = a*b;
                break;

            case "-":
                resultOp = b-a;
                break;

            case "/":
                resultOp = b/a;
                break;
        }

        System.out.println(resultOp);
        return resultOp;
    }

    static boolean isNumber(String val){
        String[] operators = {"*", "+", "-", "/"};

        for(int i = 0; i < operators.length; i++){
            if(val.equals(operators[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(tokens));
    }
}
