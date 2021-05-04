package string;

import java.util.HashMap;

public class SecondMostRepeated {
    public static void main(String[] args) {
        String[] arr = {"geek", "for", "geek", "for", "geek", "aaa"};
        HashMap<String, Integer> hashMap = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j].equals(arr[i])) {
                    if (!hashMap.containsKey(arr[j])) {
                        hashMap.put(arr[j], Integer.MAX_VALUE);
                        if(j < hashMap.get(arr[j])){
                            hashMap.put(arr[j], j);
                        }
                    }
                }
            }
        }
        int less = Integer.MAX_VALUE;
        String key = "";
        for (String s: hashMap.keySet()){
            if (hashMap.get(s) < less){
                less = hashMap.get(s);
                key = s;
            }
        }
        System.out.println(key);
    }
}
