import com.sun.security.jgss.GSSUtil;

public class Binary_Search {

//    public static int binarySearch(int[] nums, int target){
//
//        int low = 0, high = nums.length - 1;
//
//        while(low <= high){
//            int mid = (low + high)/2;
//            if(nums[mid] == target) return mid;
//            else if (nums[mid+1] > target) {
//                high = mid;
//            } else{
//                low = mid+1;
//            }
//        }
//
//        return -1;
//    }

    public static int binarySearch(int target, int low, int high, int[] nums){

        if(low > high){
            return -1;
        }

        int mid = (low + high)/2;

        if(nums[mid] == target) return mid;
        else if (nums[mid] > target) {
            return binarySearch(target, 0, mid-1, nums);
        } else{
            return binarySearch(target, mid+1, high, nums);
        }

    }

    public static void main(String[] args){

        int[] nums = {-1,0,3,5,9,12};
        int target = -1;

        int idx = binarySearch(target, 0, nums.length-1, nums);
        System.out.println(idx);
    }
}
