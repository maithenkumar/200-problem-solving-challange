import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };//9,1,4,7,3,-1,0,5,8,-1,6
                                            //0,,1,`
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length<2)return nums.length; 

        int count = 0;
        int temp=   ;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                temp += 1;
            }
        }
        return count + 1;
    }
}
