package string;

public class RemoveConsecutiveChar {
    public static void main(String[] args) {
        String str = "bcdebeaec";
        System.out.println(check(str));
    }

    private static String check(String S) {
        int n = S.length();
        StringBuilder stringBuilder = new StringBuilder(n);
        if (n == 1) {
            stringBuilder.append(S.charAt(0));
            return stringBuilder.toString();
        }
        stringBuilder.append(S.charAt(0));
        int sbL = 0;

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != stringBuilder.charAt(sbL)){
                stringBuilder.append(S.charAt(i));
                sbL++;
            }
        }
        return stringBuilder.toString();
    }
}
