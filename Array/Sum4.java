import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static void main(String[] args) {
        int [] arr={1,0,-1,0,-2,2};
        Sum4 out=new Sum4();
        System.out.println(out.fourSum(arr, 0));
    }
    //optimal
    public List<List<Integer>> fourSum2(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        int n = nums.length;
        // Sorting the array
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // Skip duplicates
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return quadruplets;
    }

    public  List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        // List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int index = i + 1; index < nums.length - 2; index++) {
                int i2 = index + 1;
                int i3 = nums.length - 1;
                while (i2 < i3) {
                    int val = nums[i] + nums[index] + nums[i2] + nums[i3];
                    if (val == target) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[index]);
                        temp.add(nums[i2]);
                        temp.add(nums[i3]);
                        ans.add(temp);
                        i2+=1;
                    } else if (val < target) {
                        i2+=1;
                    } else if (val > target) {
                        i3-=1;
                    }
                }

            }
        }
        return ans;
    }
}