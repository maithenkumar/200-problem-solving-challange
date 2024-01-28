package Zoho;
// https://leetcode.com/problems/longest-palindromic-substring/submissions/1152787147/
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome2("cbbd"));

    }

    public static String longestPalindrome2(String s) {
        return cheak(s, 0, "");

    }
    static String cheak(String str,int len,String ans){
        if (str.length() <=0) {
            return "";

        }
        if (isPlandrom(str)) {
            if (len<str.length()) {
                ans=str;
            }
        }
        String str1=str.substring(0, str.length()-1);
        String str2=str.substring(1, str.length());
        cheak(str1, len, ans);
        cheak(str2, len, ans);
        return "";
    }
    public static String longestPalindrome(String s) {
        int ien = 0;
        String ans = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {
                temp += s.charAt(j);
                if (isPlandrom(temp)) {
                    if (ien < temp.length()) {

                        ans = temp;
                        // temp="";
                        ien = temp.length();
                    }
                } else {
                    break;
                }

            }
            temp = "";
        }

        return ans;
    }

    static boolean isPlandrom(String str) {

        // while (i != j) {
        // if (str.charAt(i) == str.charAt(j)) {
        // i++;
        // j--;
        // } else {
        // return false;
        // }
        // }
        String chek = "";
        for (int j2 = str.length() - 1; j2 >= 0; j2--) {
            chek += str.charAt(j2);
        }

        if (chek.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

}
