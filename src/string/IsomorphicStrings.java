package string;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xyb";

//        int[] map1 = new int[256];
//
//        for (int i = 0; i < s1.length(); i++) {
//            System.out.println(map1[s1.charAt(i)]);
//        }

        System.out.println(areIsomorphic(s1, s2));

    }

    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if (str1.length() != str2.length())
            return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            if (map1[str1.charAt(i)] != map2[str2.charAt(i)])
                return false;

            map1[str1.charAt(i)] = 1;
            map2[str2.charAt(i)] = 1;
        }

//        HashMap<Character,Character> hashMap = new HashMap<>(str1.length());
//
//        for (int i = 0; i < str1.length(); i++) {
//            if (!hashMap.containsKey(str1.charAt(i))){
//                hashMap.put(str1.charAt(i), str2.charAt(i));
//            }else {
//                if (hashMap.get(str1.charAt(i)) != str2.charAt(i))
//                    return false;
//            }
//        }
        return true;
    }
}
