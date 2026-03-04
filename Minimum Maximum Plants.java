import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        Map<Integer, TreeSet<Integer>> brokenMap = new HashMap<>();
        for (int i = 0; i < K; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            brokenMap.putIfAbsent(r, new TreeSet<>());
            brokenMap.get(r).add(c);
        }
        long maxTotal = 0;
        long minTotal = 0;
        for (int i = 0; i < R; i++) {
            int lastBroken = -1;
            TreeSet<Integer> rowBroken = brokenMap.getOrDefault(i, new TreeSet<>());
            for (int b : rowBroken) {
                int length = b - lastBroken - 1;
                if (length > 0) {
                    maxTotal += (length + 1) / 2;
                    minTotal += (length + 2) / 3;
                }
                lastBroken = b;
            }
            int lastLength = C - lastBroken - 1;
            if (lastLength > 0) {
                maxTotal += (lastLength + 1) / 2;
                minTotal += (lastLength + 2) / 3;
            }
        }
        System.out.println(maxTotal + " " + minTotal);
    }
}
