import java.util.*;

public class threeSum {

//    public List<List<Integer>> threeSum(int[]  nums){
//        List<List<Integer>> solution = new ArrayList<>();
//        int left = 0;
//
//        if(nums.length < 3) return solution;
//
//        while(left != nums.length - 2){
//
//            int right = left + 1;
//            while(right != nums.length - 1){
//                int sum = nums[left] + nums[right];
//                for(int i = 0; i < nums.length; i++){
//                    if(sum + nums[i] == 0 && i != left && i != right) {
//                        List<Integer> temp = new ArrayList<>();
//                        temp.add(nums[left]);
//                        temp.add(nums[right]);
//                        temp.add(nums[i]);
//                        Collections.sort(temp);
//                        if (!solution.contains(temp)) {
//                            solution.add(temp);
//                        }
//                    }
//                }
//                right++;
//            }
//            left++;
//        }
//
//        return solution;
//
//
//    }

    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> solution = new ArrayList<>();

        if(nums.length < 3) return solution;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == -nums[i]){
                    solution.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right++;
                    }
                } else if (sum > -nums[i]) {
                    right--;
                } else{
                    left++;
                }
            }

        }

        return solution;
    }

    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        int[] nums2 = {0,1,1};
        int[] nums3 = {0, 0, 0};
        int[] numsEmpty = {};

        threeSum instance = new threeSum();
        System.out.println(instance.threeSum(nums));
    }
}
