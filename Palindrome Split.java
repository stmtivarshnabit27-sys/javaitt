import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = Integer.parseInt(sc.next());
            while (T-- > 0) {
                String s = sc.next();
                Map<Character, Integer> freqMap = new HashMap<>();
                for (char c : s.toCharArray()) {
                    freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
                }

                int totalPalindromes = 0;
                for (int count : freqMap.values()) {
                    totalPalindromes += count / 2;
                }
                System.out.println(totalPalindromes);
            }
        }
        sc.close();
    }
}
