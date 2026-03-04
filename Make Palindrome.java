import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] alphabet = new int[26]; 
            for (int i = 0; i < s.length(); i++) {
                char letter = s.charAt(i);
                alphabet[letter - 'a']++; 
            }
            int a = 0;
            for (int i = 0; i < 26; i++) {
                if (alphabet[i] % 2 != 0) {
                    a++;
                }
            }
            if (a <= 1) {
                System.out.println(0);
            } else {
                System.out.println(a- 1);
            }
            t--;
        }
    }
}
