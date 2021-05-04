package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAnagramsTogether {
    public static void main(String[] args) {
        String[] words = {"act", "god", "cat", "dog", "tac"};
        List<List<String>> ans = Anagrams(words);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    private static List<List<String>> Anagrams(String[] string_list) {

        String word, newWord;
        char[] letters;
        HashMap<String, List<String>> hashMap = new HashMap<>(string_list.length);

        // Your Code here
        for (String value : string_list) {
            word = value;
            letters = word.toCharArray();
            Arrays.sort(letters);
            newWord = new String(letters);

            if (hashMap.containsKey(newWord)) {
                hashMap.get(newWord).add(word);
            } else {
                List<String> ls = new ArrayList<>(1);
                ls.add(word);
                hashMap.put(newWord, ls);
            }
        }
        List<List<String>> lls = new ArrayList<>(hashMap.size());
        int index = 0;
        for (String s : hashMap.keySet()) {
            List<String> v = hashMap.get(s);
            lls.add(index, v);
        }
        return lls;
    }
}
