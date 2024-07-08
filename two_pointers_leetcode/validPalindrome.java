public class validPalindrome {

    public boolean isPalindrome(String s){

        String trimmedString = s.replaceAll("\\s|[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(trimmedString);
        int left = 0;
        int right = trimmedString.length() - 1;

        if(trimmedString.length() == 0 || trimmedString.length() == 1) return true;

        while(left < right){
            if(trimmedString.charAt(left) != trimmedString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){

        String s = "race a car";

        validPalindrome vp = new validPalindrome();

        System.out.println(vp.isPalindrome(s));
    }
}
