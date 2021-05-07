package learning;

import java.util.HashMap;

public class HashDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(1, 1010);
        hashMap.put(2, 1004);
        hashMap.put(5, 1060);
        hashMap.put(3, 1800);
        hashMap.put(8, 1000);

        for (Integer i : hashMap.keySet()) {
            System.out.println("key "+i+"--> value "+hashMap.get(i));
        }
    }
}
