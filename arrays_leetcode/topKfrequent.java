import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class topKfrequent {
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> checkMap = new HashMap<>();

        for (int num : nums) {
            if (checkMap.get(num) == null) {
                checkMap.put(num, 1);
            } else {
                checkMap.put(num, checkMap.get(num) + 1);
            }
        }

        int[] frequentElements = new int[checkMap.size()];
        int[] valueSet = new int[checkMap.size()];
        int i = 0;
        int j = 0;

        System.out.println("printing key set");
        for (int key : checkMap.keySet()) {
            frequentElements[i] = key;
            System.out.println(frequentElements[i]);
            i++;
        }
        System.out.println("printing value set");
        for(int value : checkMap.values()){
            valueSet[j] = value;
            System.out.println(valueSet[j]);
            j++;
        }
        System.out.println(checkMap);

        for(int index = 1; index < checkMap.size(); index++){
            int tempKey = frequentElements[index];
            int tempValue = valueSet[index];
            int index2 = index - 1;
            while(index2 >= 0 && valueSet[index2] > tempValue){
                valueSet[index2 + 1] = valueSet[index2];
                frequentElements[index2 + 1] = frequentElements[index2];
                index2--;
            }
            valueSet[index2+1] = tempValue;
            frequentElements[index2+1] = tempKey;
        }

        for(int a = 0; a < frequentElements.length/2; a++){
            int temp = frequentElements[frequentElements.length - a - 1];
            frequentElements[frequentElements.length - a - 1] = frequentElements[a];
            frequentElements[a] = temp;
        }

        int[] result = new int[k];
        for(int a = 0; a < k; a++){
            result[a] = frequentElements[a];
        }

        for(int number : frequentElements){
            System.out.println(number);
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {4,1,-1,2,-1,2,3};
        System.out.println(topKFrequent(nums, 2));
    }
}
