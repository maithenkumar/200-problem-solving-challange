import java.util.HashMap;

public class FindtheDuplicateNumber {
    // optimal
    public int findDuplicate2(int[] nums) {
        // [1,3,4,2,2]
        // [true,true,true,true,]
        boolean[] ans = new boolean[nums.length];
        for (int b : nums) {
            if (ans[b])
                return b;
            ans[b] = true;
        }

        return -1;
    }

    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            } else {
                map.put(nums[i], 1);
            }
        }
        return -1;
    }

}
