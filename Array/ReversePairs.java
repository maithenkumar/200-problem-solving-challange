/**
 * ReversePairs
 */
public class ReversePairs {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 3, 5, 1 };
        System.out.println(reversePairs2(nums));
        // long originalValue = 2147483647L; // Note the 'L' suffix to indicate a long
        // literal
        // long result = originalValue * 2; 
        // System.out.println(result);
    }

    // tow pointer solution
    public static int reversePairs2(int[] nums) {
        int count = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            // if (nums[i] > nums[j]) {
            // j--;
            // }
            // else
            // if (nums[i] < nums[j]) {
            long originalValue = (long) nums[j]; // Note the 'L' suffix to indicate a long literal
            long result = originalValue * 2;

            if (nums[i] > result) {
                count += 1;

                i++;
            }

            // }
            else {
                j--;
            }
        }
        return count;
    }

    // brute force solntion
    public static int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j) {
                    long originalValue = (long) nums[j]; // Note the 'L' suffix to indicate a long literal
                    long result = originalValue * 2;

                    if (nums[i] > result) {

                        count += 1;
                    }

                }
            }
        }
        return count;
    }
}