public class twoSum {
    public int[] twoSum(int[] arr, int target){
        int[] sumArray = new int[2];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if( i == j){
                    break;
                }
                else{
                    if(arr[i] + arr[j] == target){
                        sumArray[0] = i;
                        sumArray[1] = j;

                    }
                }
            }
        }
        return sumArray;
    }
}
