import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long MOD = 1_000_000_007;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            long evenSum = 1;
            long oddSum = 0;
            long currentWays = 0;
            int prefixXor = 0;
            for (int i = 0; i < n; i++) {
                prefixXor ^= a[i];
                if (Integer.bitCount(prefixXor) % 2 != 0) {
                    currentWays = evenSum % MOD;
                    oddSum = (oddSum + currentWays) % MOD;
                } else {
                    // Current prefix is even, must split after an odd prefix
                    currentWays = oddSum % MOD;
                    evenSum = (evenSum + currentWays) % MOD;
                }
            }
            System.out.println(currentWays);
        }
    }
}
