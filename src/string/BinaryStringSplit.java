package string;

public class BinaryStringSplit {
    public static void main(String[] args) {
        String str = "0111100010";
        int count = 0, count_0 = 0, count_1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0')
                count_0++;
            else if(str.charAt(i) == '1')
                count_1++;

            if(count_0 == count_1)
                count++;
        }
        if (count_0 != count_1)
            System.out.println(-1);
        else
            System.out.println(count);
    }
}
