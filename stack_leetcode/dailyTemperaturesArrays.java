import java.util.Arrays;

public class dailyTemperaturesArrays {

    public static int[] dailyTemperatures(int[] temperatures){

        if(temperatures.length == 1) {
            return new int[] {0};
        }

       int[] waitTime = new int[temperatures.length];
        Arrays.fill(waitTime, 0);

        for(int i = 0; i < temperatures.length; i++){
            int currentTemp = temperatures[i];
            for(int j = 0; j < i; j++){
                if(temperatures[j] < temperatures[i] && waitTime[j] == 0){
                    waitTime[j] = i-j;
                }
            }
        }

        for(int i = 0; i < waitTime.length; i++){
            System.out.print(waitTime[i] + " ");
        }

        return waitTime;
    }

    public static void main(String[] args){

        int[] temperatures = {30,60,90};

        dailyTemperatures(temperatures);
    }
}
