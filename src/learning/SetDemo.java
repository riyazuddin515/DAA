package learning;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);

        for (Integer i:set) {
            System.out.println(i);
        }
    }
}
