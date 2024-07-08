public class evalRPN {

    public int evalRPN(String[] tokens){

        if(tokens.length == 1 && isNumber(tokens[0])) return Integer.parseInt(tokens[0]);
        if(tokens.length == 2){
            
        }
    }

    boolean isNumber(String val){
        String[] operators = {"*", "+", "-", "/"};

        for(int i = 0; i < operators.length; i++){
            if(val.equals(operators[i])){
                return false;
            }
        }
        return true;
    }
}
