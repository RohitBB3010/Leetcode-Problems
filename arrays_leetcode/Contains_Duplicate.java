import java.util.HashMap;

public class Contains_Duplicate{

    public boolean containsDuplicate(int[] num){
        HashMap<Integer, Integer> arrays = new HashMap<Integer, Integer>();

       for(int i = 0; i < num.length; i++){
           if(arrays.get(num[i]) == 0){
               arrays.put(num[i], 1);
           } else{
               arrays.put(num[i], arrays.get(num[i])+1);
           }
       }

       for(int i = 0; i < arrays.size(); i++){
           if(arrays.get(num[i]) > 1){
               return true;

           }
       }
       return false;
    }
}