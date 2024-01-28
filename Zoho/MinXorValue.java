public class MinXorValue {
    public static int findMin2(int A, int B) {
        int result = Integer.MAX_VALUE;

        // Loop through all possible values of X
        for (int X = 0; X <= Math.max(A, B); X++) {
            int currentResult = (A ^ X) + (B ^ X);
            result = Math.min(result, currentResult);
        }

        return result;
    }
    public static int findMin(int A, int B) {
        int result = Integer.MAX_VALUE;

        for  (int i = 0; i <= 106; i++) {
            result = Math.min(result, (A ^ i) + (B ^ i));
        }

        return result;
    }

    public static void main(String[] args) {
        int A = 4;
        int B = 6;

        int minResult = findMin2(A, B);
        System.out.println(minResult);
    }
}
