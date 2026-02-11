import java.util.HashSet;
class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> evens = new HashSet<>();
            HashSet<Integer> odds = new HashSet<>();
            
            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    evens.add(nums[j]);
                } else {
                    odds.add(nums[j]);
                }
                if (evens.size() == odds.size()) {
                    int length = j - i + 1;
                    if (length > maxLen) {
                        maxLen = length;
                    }
                }
            }
        }
        return maxLen;
    }
}
