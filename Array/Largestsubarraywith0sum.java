import java.util.HashMap;

public class Largestsubarraywith0sum {

    public static void main(String[] args) {
        int N = 8;
        int A[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(maxLen2(A, N));
    }

//optimal
    static int maxLen2(int arr[], int n) {
        int maxSubArrayLength = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                maxSubArrayLength = Math.max(maxSubArrayLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxSubArrayLength;
    }

    static int maxLen(int arr[], int n) {
        int max = 0;
        // Your code here
        for (int i = 0; i < n; i++) {
            int tol = 0;
            int count = 0;
            for (int j = i; j < n; j++) {
                tol += arr[j];
                count += 1;
                if (tol == 0) {
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }

}
