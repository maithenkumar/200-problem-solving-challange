import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {

    public static void main(String[] args) {
      
        System.out.println(generate1(5));

    }

    public static List<List<Integer>> generate1(int numRows) {

        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
	ArrayList<Integer> row = new ArrayList<Integer>();
	for(int i=0;i<numRows;i++)
	{
		row.add(0, 1);
		for(int j=1;j<row.size()-1;j++)
			row.set(j, row.get(j)+row.get(j+1));
		allrows.add(new ArrayList<Integer>(row));
	}
	return allrows;
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans2 = new ArrayList<>();

        int[][] ans = new int[numRows][numRows];

        for (int i = 0; i < numRows; i++) {
            int[] temp = new int[i + 1];
            // ArrayList<Integer>temp=new ArrayList<>(i);
            temp[0] = 1;
            for (int j = 1; j < temp.length - 1; j++) {
                temp[i] = ans[i - 1][i-1]+ans[i - 1][i-1];

            }
            // if (temp.length == 2) {
            //     temp[temp.length - 1] = 1;
            // } else {
                temp[temp.length - 1] = 1;
                
            // }
            ans[i] = temp;
            // ans.add(Arrays.toString(temp));
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
        return ans2;
    }
}
