import java.util.ArrayList;
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1"; 
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); 
        for (int iteration = 1; iteration < n; iteration++) {
            ArrayList<Integer> nextArr = new ArrayList<>();
            for (int i = 0; i < arr.size(); i++) {
                int count = 1;
                while (i + 1 < arr.size() && arr.get(i).equals(arr.get(i + 1))) {
                    count++;
                    i++;
                }
                nextArr.add(count);
                nextArr.add(arr.get(i));
            }
            arr = nextArr; 
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : arr) {
            sb.append(num);
        }
        return sb.toString();
    }
}
