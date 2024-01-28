package Zoho;


import java.util.HashMap;

public class CountandSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));

    }

    public static String countAndSay1(int n) {
        if (n < 2) {
            return "" + n;
        }   
        String ans="11";

        for (int i = 3; i < n; i++) {
            int count=0;
            for (int j = 0; j < ans.length(); j++) {
                
            }
        }
    }
    public static String countAndSay(int n) {
        if (n < 2) {
            return "" + n;
        }
        String ans = "11";

        for (int j = 2; j < n; j++) {
            ans = helper(ans);
        }
        // do{

        // }while(){

        // }
        return ans;
    }

    static String helper(String str) {
        String ans = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {

                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i), 1);

            }
        }
        int i = 0;
        while (!map.isEmpty()) {
            if (map.containsKey(str.charAt(i))) {
                ans += map.get(str.charAt(i)) ;
                ans+= str.charAt(i);
                map.remove(str.charAt(i));

            }
            i++;
        }
        return ans;

    }

}
