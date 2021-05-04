package string;

public class ValidShuffle {
    public static void main(String[] args) {
        System.out.println(shuffleCheck("XY", "12", "1XY2"));
        System.out.println(shuffleCheck("XY", "12", "12XY"));
        System.out.println(shuffleCheck("XY", "12", "XY12"));
        System.out.println(shuffleCheck("XY", "12", "X1Y2"));
        System.out.println(shuffleCheck("XY", "12", "Y12X"));
    }
    private static boolean shuffleCheck(String first, String second, String result){
        if(first.length() + second.length() != result.length())
            return false;
        int i = 0, j = 0, k = 0;
        while (k < result.length()) {
            if(i < first.length() && first.charAt(i) == result.charAt(k))
                i++;
            else if(j < second.length() && second.charAt(j) == result.charAt(k))
                j++;
            else return false;

            k++;
        }
        return i >= first.length() || j >= second.length();
    }
}

