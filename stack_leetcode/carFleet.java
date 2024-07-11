import java.util.Arrays;

public class carFleet {

    public static int carFleet(int target, int[] position, int[] speed){
        int[][] matrix = new int[position.length][2];

        for(int i = 0; i < position.length; i++){
            matrix[i][0] = position[i];
            matrix[i][1] = speed[i];
        }

        Arrays.sort(matrix, (a, b) -> Integer.compare(a[0], b[0]));

        int fleets = 1;
        double prevTime = calcTime(target, matrix[position.length-1][0], matrix[position.length-1][1]);


        for(int i = position.length-1; i >= 0; i--){
            double time = calcTime(target, matrix[i][0], matrix[i][1]);
            System.out.println(time);
            if(time > prevTime){
                fleets++;
                prevTime = time;
            }
        }

        return fleets;
    }

    public static double calcTime(int target, int position, int speed){
        double calcTime = (double) (target - position)/speed;
        return calcTime;
    }

    public static void main(String[] args){

        int target = 10;
        int[] position = {6,8};
        int[] speed = {3,2};

        System.out.println(carFleet(target, position, speed));
    }
}
