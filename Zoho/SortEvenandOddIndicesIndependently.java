public class SortEvenandOddIndicesIndependently {//4,1,2,3]
    // https://chat.openai.com/c/199e2b25-e2e0-4449-9d60-8298b30a9731                                      1,2,3,4
    public int[] sortEvenOdd(int[] nums) {
        // Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while (i<j) {
            if (nums[i]%2==0&&nums[j]%2==0 &&nums[i]>nums[j]) {
                swap(nums, i, j);
                i++;
                j--;
            }

            else if (nums[i]%2!=0&&nums[j]%2!=0 &&nums[i]<nums[j]) {
                swap(nums, i, j);
                i++;
                j--;
            }
            else{
                i++;
            }
        }
        return nums;
        
    }
    // helper function
    static void swap (int  []nums,int l,int r){
        int temp=nums[l];
        nums[l] = nums[r];
        nums[r] = temp;

    }
}