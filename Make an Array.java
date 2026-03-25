import java.util.*;
public class Solution {
    public static long solve(int N, int[] A) {
        if (N == 1) {
            return A[0] == 0 ? 0 : -1;
        }
        long sum = 0;
        int maxVal = 0;
        for (int val : A) {
            sum += val;
            if (val > maxVal) {
                maxVal = val;
            }
        }
        if (sum % (N - 1) != 0) {
            return -1;
        }
        long K = sum / (N - 1);
        if (maxVal > K) {
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
                int[] A = new int[N];
                for (int i = 0; i < N; i++) {
                    A[i] = sc.nextInt();
                }
                System.out.println(solve(N, A));
            }
        }
        sc.close();
    }
}
