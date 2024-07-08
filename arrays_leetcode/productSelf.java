import java.util.*;

public class productSelf {
    public static int[] productExceptSelf(int[] nums){
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int[] productArray = new int[nums.length];
        int leftProductNum = 1;
        int rightProductNum = 1;

        //for(int i = 0)
        return leftProduct;
    }

    public static int giveProduct(int[] nums, int k){
        int currentProduct = 1;
        for(int number : nums){
            if(number != k)
            currentProduct = currentProduct*number;
        }
        return currentProduct;
    }

    public static void main(String[] args){
        int[] nums = {-1,1,0,-3,3};
        System.out.println("Rohit");
        productExceptSelf(nums);
    }
}
