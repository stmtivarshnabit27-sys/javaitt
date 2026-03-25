import java.util.*;
public class Solution {
    public static long solve(int N, long[] A) {
        long sum = 0;
        for (long val : A) {
            sum += val;
        }
        long K = -sum;
        if (K < 0) {
            return -1;
        }
        long min_x_sum = 0;
        for (long val : A) {
            if (val < 0) {
                min_x_sum += (-val + 1) / 2;
            }
        }
        if (min_x_sum > K) {
            return -1;
        }

        return K;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int N = sc.nextInt();
                long[] A = new long[N];
                for (int i = 0; i < N; i++) {
                    A[i] = sc.nextLong();
                }
                System.out.println(solve(N, A));
            }
        }
        sc.close();
    }
}
