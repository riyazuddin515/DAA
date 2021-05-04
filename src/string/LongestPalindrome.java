package string;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abc"));
    }

    private static String brute(String s) {
        int max = Integer.MIN_VALUE;
        int l = 0,h = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
//                System.out.println(sub);
                StringBuilder sb = new StringBuilder(sub);
                sb.reverse();
                if (sub.equals(sb.toString()) && sub.length() > max) {
                    max = sub.length();
                    l = i;
                    h = j;
                }
            }
        }
        return s.substring(l, h);
    }
    private static String longestPalindrome(String s){
        // code here
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = check(s, i, i);
            int len2 = check(s, i, i + 1);
            int len = Integer.max(len1, len2);
            if (len > end - start) {
                start = i - ((len -1) / 2);
                end = i + (len / 2);
            }
        }
        if (start == end)
            return s.substring(0, 1);
        return s.substring(start, end + 1);
    }
    private static int check(String s,int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
