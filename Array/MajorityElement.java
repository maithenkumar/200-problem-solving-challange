// https://leetcode.com/problems/majority-element-ii/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 3, 2, 3 }));
    }

    public static List<Integer> majorityElement2(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) > (nums.length / 3)) {
                    ans.add(nums[i]);
                    map.remove(nums[i]);
                }
            } else {

                map.put(nums[i], 1);
                if (map.get(nums[i]) > (nums.length / 3)) {
                    ans.add(nums[i]);
                    map.remove(nums[i]);
                }
            }

        }
        return ans;
    }



    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) > (nums.length / 3)) {
                    ans.add(nums[i]);
                    map.remove(nums[i]);
                }
            } else {

                map.put(nums[i], 1);
            }

        }

        // System.out.println(map);
        // for (int i = 0; i < nums.length; i++) {
        // if (map.containsKey(nums[i])) {
        // if (map.get(nums[i]) > (nums.length / 3)) {
        // ans.add(nums[i]);
        // map.remove(nums[i]);
        // }
        // }
        // }
        return ans;
    }

}
