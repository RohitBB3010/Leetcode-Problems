import java.util.Arrays;
import java.util.Stack;

public class dailyTemperaturesStack {

    public static int[] dailyTemperatures(int[] temperatures){
        int[] result = new int[temperatures.length];
        Arrays.fill(result, 0);
        Stack<Integer> stack = new Stack();
        stack.push(0);

        for(int i = 1; i < temperatures.length; i++){

                while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                    int index = stack.pop();

                    result[index] = i - index;

                }

                stack.push(i);

        }

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        return  result;
    }
    public static void main(String[] args){

        int[] temperatures = {73,74,75,71,69,72,76,73};

        dailyTemperatures(temperatures);
    }
}
