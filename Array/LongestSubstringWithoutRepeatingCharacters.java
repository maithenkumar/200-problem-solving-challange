import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    
    public static int lengthOfLongestSubstring(String s) {
        boolean ifnot=false;
        if (s.length()<2) {
            return s.length();
        }
        int max=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                ifnot=true;
                max=Math.max(max, i-map.get(s.charAt(i)));
                map.put(s.charAt(i), i);
            }else{
                map.put(s.charAt(i), i);
            }
        }
        if (ifnot==false) {
            return s.length()-1;
        }
        return max;

    }
}
