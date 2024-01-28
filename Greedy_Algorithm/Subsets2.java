import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Subsets2
 */
public class Subsets2 {
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println( subsetsWithDup(arr));
    }   
 public static   List<List<Integer>> subsetsWithDup2(int[] nums) {
    HashSet<List<Integer>> set =new HashSet<>();
    List<List<Integer>> result =new ArrayList<>();
    set.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> temp=new ArrayList<>();
            for (int j = i; j < nums.length; j++) {
                temp.add(nums[j]);
                set.add(new );
            }
        }
      

            result.addAll(set);
        

return result;
    
 }
 public static   List<List<Integer>> subsetsWithDup(int[] nums) {
    HashSet<List<Integer>> set =new HashSet<>();
    List<List<Integer>> result =new ArrayList<>();
    set.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> temp=new ArrayList<>();
            for (int j = i; j < nums.length; j++) {
                temp.add(nums[j]);
                set.add(new ArrayList<>(temp));
            }
        }
      

            result.addAll(set);
        

return result;
}
}