import java.util.Arrays;

public class MinStack {
    int[] stack;
    int pointer = -1;
    static int default_size = 20;
    int[] min = new int[default_size];
    int pointerMin = -1;
    public MinStack(){
        stack = new int[default_size];
    }

    public boolean isFull(){
        return pointer == stack.length-1;
    }

    public boolean isEmpty(){
        return pointer == -1;
    }

    public void push(int val){
        if(isFull()){
            int[] temp = new int[2*stack.length];
            for(int i = 0; i < stack.length; i++){
                temp[i] = stack[i];
            }
            stack = temp;
        }
        pointer++;
        stack[pointer] = val;
        if(pointer == 0) {
            pointerMin++;
            min[pointerMin] = val;
        }

        int currentMin = Math.min(val, min[pointerMin]);
        if(currentMin == val){
            if(pointerMin == min.length - 1){
                int[] temp = new int[2*min.length];
                for(int i = 0; i < min.length; i++){
                    temp[i] = min[i];
                }
                min = temp;
            }
            pointerMin++;
            min[pointerMin] = currentMin;
        }
    }

    public void pop(){
        if(stack[pointer] == min[pointerMin]){
            pointerMin--;
        }
        pointer--;
    }

    int top(){
        return stack[pointer];
    }

    int getMin(){
        return min[pointerMin];
    }
}
