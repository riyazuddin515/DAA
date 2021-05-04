package string;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] s1 = {'b', 'a', 'n', 'a', 'n', 'a'};
        reverseString(s);
        reverseString(s1);
    }

    public static void reverseString(char[] s) {
        int n = s.length - 1;
        int i = 0;
        while(i <= n){
            char c = s[i];
            s[i] = s[n];
            s[n] = c;
            i++;
            n--;
        }
        for(char c: s){
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
