public class longestConsequence {

    public static int longestConsecutiveConsequence(int[] nums){
        int returnLongestConsequence = 0;
        int tempStore = 0;

        for(int i = 1; i < nums.length; i++){
            int temp = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] == nums[i]+1){
                tempStore++;
                System.out.println(i);
                System.out.println(nums[i]);
                System.out.println(nums[i+1]);

            } else if (nums[i+1] == nums[i]) {
                
            } else{
                tempStore = 0;
            }
            if(tempStore > returnLongestConsequence){
                returnLongestConsequence = tempStore;
            }
            System.out.println();
        }
        returnLongestConsequence++;
        System.out.println(returnLongestConsequence);
        return returnLongestConsequence;
    }

    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        int[] nums2 = {1,2,0,1};
        longestConsecutiveConsequence(nums2);
    }
}
