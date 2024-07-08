import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public int longestConsecutive(int[] nums) {
        int max_sequence = 0;
        int count = 0;

        //case where array is empty
        if (nums.length == 0) return 0;

        //case where array has a single element
        if (nums.length == 1) return 1;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {

            if ( nums[i - 1] == nums[i] - 1) {
                count++;
            } else if (nums[i-1] == nums[i]) {

            } else{
                count = 0;
            }
            max_sequence = Math.max(max_sequence, count);
        }

        return max_sequence + 1;
    }


    public static void main(String[] args){

        LongestConsecutiveSubsequence seq = new LongestConsecutiveSubsequence();

        int[] nums = {100,4,200,1,3,2};
        int[] nums2 = {1, 2, 0, 1};

        System.out.println(seq.longestConsecutive(nums2));

    }
}
