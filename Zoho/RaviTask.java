import java.util.Scanner;

public class RaviTask {

    public static long solution(long[] a, int[] b) {
        long sum = 0;

        for (int index : b) {
            sum += a[index];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N and array A
        int N = scanner.nextInt();
        long[] arrayA = new long[N];
        for (int i = 0; i < N; i++) {
            arrayA[i] = scanner.nextLong();
        }

        // Input M and array B
        int M = scanner.nextInt();
        int[] arrayB = new int[M];
        for (int i = 0; i < M; i++) {
            arrayB[i] = scanner.nextInt();
        }

        // Calculate and print the sum
        long result = solution(arrayA, arrayB);
        System.out.println(result);

        scanner.close();
    }
}
