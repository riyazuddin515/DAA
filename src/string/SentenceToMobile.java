package string;

import array.SubArrayWithSumZero;

public class SentenceToMobile {
    public static void main(String[] args) {
        String[] keypad = {
                "2", "22", "222",
                "3", "33", "333",
                "4", "44", "444",
                "5", "55", "555",
                "6", "66", "666",
                "7", "77", "777","7777",
                "8", "88", "888",
                "9", "99", "999", "9999"
        };
        String s = "GEEKSFORGEEKS";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
                System.out.print(" ");
            else {
                int j = s.charAt(i) - 'A';
                System.out.print(keypad[j]);
            }
        }
    }
}
