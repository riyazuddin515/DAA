package linkedlist;

import java.util.Arrays;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String a = "hrqcvsvszpsjammdrw";
        int[] r = new int[26];
        Arrays.fill(r, 0);

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (r[c - 'a'] == 0) {
                r[c - 'a']++;
            }else {
                a = a.substring(0, i) + "#" + a.substring(i+1);
            }
        }
        System.out.println(a);
    }
}
