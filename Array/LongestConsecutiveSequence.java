import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = { 0,3,7,2,5,8,4,3,6,0,1};// 9,1,4,7,3,-1,0,5,8,-1,6
                                             // 0,,1,`
        System.out.println(longestConsecutive(arr));
    }

public int longestConsecutive2(int[] nums) {
    if(nums == null || nums.length == 0) return 0;
    
    Set<Integer> set = new HashSet<Integer>();
    
    for(int num: nums) set.add(num);
    int max = 1;
    for(int num: nums) {
        if(set.remove(num)) {//num hasn't been visited
            int val = num;
            int sum = 1;
            while(set.remove(val-1)) val--;
            sum += num - val;
            
            val = num;
            while(set.remove(val+1)) val++;
            sum += val - num;
            
            max = Math.max(max, sum);
        }
    }
    return max;
}

    public static int longestConsecutive(int[] nums) {
        if (nums.length < 2)
            return nums.length;

        int count = 0;
        int temp = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]||nums[i]  == nums[i + 1]) {
                if (temp == 0) {
                    temp = 2;
                } else {
                    temp += 1;
                }
            } else {
                count += temp;
                temp = 0;
            }
        }
        count+=temp;
        return count ;
    }
}
