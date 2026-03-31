import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) 
        return;
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }
        System.out.println(solve(n, nums));
    }
    public static long solve(int n, long[] nums) {
        Map<Integer, Long> counts = new HashMap<>();
        long totalPairs = 0;
        for (long num : nums) {
            int digitSum = getDigitSum(num);
            if (counts.containsKey(digitSum)) {
                totalPairs += counts.get(digitSum);
            }
            counts.put(digitSum, counts.getOrDefault(digitSum, 0L) + 1);
        }
        return totalPairs;
    }
    private static int getDigitSum(long n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
