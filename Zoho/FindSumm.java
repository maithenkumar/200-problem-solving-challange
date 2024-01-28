import java.util.ArrayList;
import java.util.List;

public class FindSumm {
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        ans.add(5);
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        ans.add(1);
        System.out.println(findSumm(ans, 1));


    }
    static int findSumm(List<Integer> arr,int k){
        int ans=0;
        for (Integer in : arr) {
            if (in%2==0) {
                if (in%k==0) {
                    ans+=in;
                }
            }
        }
        return ans;
    }
    
}
