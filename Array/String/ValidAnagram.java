package String;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram2(s, t));
    }

    public static boolean isAnagram2(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < s.length(); i++) {
            sum1 += s.charAt(i) - 'a';
        }
        for (int i = 0; i < t.length(); i++) {
            sum2 += t.charAt(i) - 'a';
        }
        if (sum1 - sum2 == 0) {
            return true;
        }
        return false;

    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }

        }
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                if (map.get(t.charAt(i)) > 0) {
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
