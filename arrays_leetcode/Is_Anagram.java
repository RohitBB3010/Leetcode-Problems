import java.util.HashMap;

public class Is_Anagram {
    public static boolean isAnagram(String s, String t){

        HashMap<Character, Integer> charMapS = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(charMapS.get(s.charAt(i)) == null){
                charMapS.put(s.charAt(i), 1);
            }
            else{
                charMapS.put(s.charAt(i), charMapS.get(s.charAt(i))+1);
            }
        }

        HashMap<Character, Integer> charMapT = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            if(charMapT.get(t.charAt(i)) == null){
                charMapT.put(t.charAt(i), 1);
            }
            else{
                charMapT.put(t.charAt(i), charMapT.get(t.charAt(i))+1);
            }
        }

        if(charMapS.equals(charMapT)){
            return true;

        }
        else{
        return false;
        }
    }

    public static void main(String []args){
        Is_Anagram isAnagram = new Is_Anagram();
        System.out.println(isAnagram("Rohit", "tohir"));
    }
}
