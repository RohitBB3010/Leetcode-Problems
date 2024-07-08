import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class groupAnagram{
    public static List<List<String>> groupAnagram(String[] strs){

        ArrayList<List<String>> groupedList = new ArrayList<>();
        HashMap<String, HashMap<Character, Integer>> toCheckModifiedList = new HashMap<>();

        for (String currentString : strs) {
            if (toCheckModifiedList.get(currentString) == null) {
                HashMap<Character, Integer> currentStringCharMap = new HashMap<>();
                for (int j = 0; j < currentString.length(); j++) {

                    if (currentStringCharMap.get(currentString.charAt(j)) == null) {
                        currentStringCharMap.put(currentString.charAt(j), 1);
                    } else {
                        currentStringCharMap.put(currentString.charAt(j), currentStringCharMap.get(currentString.charAt(j)) + 1);
                    }
                }
                toCheckModifiedList.put(currentString, currentStringCharMap);
            }
        }

        for(int i = 0; i < strs.length; i++){
            List<String> currentStringArray = new ArrayList<>();
            currentStringArray.add(strs[i]);
                for(int j = i+1; j < strs.length; j++){
                    if(toCheckModifiedList.get(strs[i]).equals(toCheckModifiedList.get(strs[j]))){
                        currentStringArray.add(strs[j]);
                    }
                }
                groupedList.add(currentStringArray);
        }

        ArrayList<List<String>> returnList = new ArrayList<>(groupedList);
        for(int i = 0; i < groupedList.size(); i++){
            for(int j = i + 1; j < groupedList.size(); j++){
                int limit = 0;
                if(groupedList.get(i).size() < groupedList.get(j).size()){
                    limit  = groupedList.get(i).size();
                } else{
                    limit = groupedList.get(j).size();
                }
//                for(int k = 0; k < limit; k++){
//                    if(groupedList.get(j).contains(groupedList.get(i).get(k))){
//                        if(groupedList.get(i).size() > groupedList.get(j).size()){
//                            returnList.remove(groupedList.get(j));
//                        } else{
//                            returnList.remove(groupedList.get(i));
//                        }
//                    }
//                }
                for(String item : groupedList.get(i)){
                    if(groupedList.get(j).contains(item)){
                        if(groupedList.get(i).size() > groupedList.get(j).size()){
                            returnList.remove(groupedList.get(j));
                        } else{
                            returnList.remove(groupedList.get(i));
                        }
                    }
                }
            }
        }

        
        return returnList;
    }

    public static void main(String[] args){
        String[] leetString = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagram(leetString));
    }
}

