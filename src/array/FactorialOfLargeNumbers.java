package array;

import java.util.ArrayList;

public class FactorialOfLargeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> al = factorial(897);
        for(Integer i: al){
            System.out.println(i);
        }
    }
    private static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> al = new ArrayList<>();
        int result = 1;
        for(int i = 1; i <= N; i++){
            result = result * i;
            if(result == 9){
                al.add(result);
                result = 1;
            }
        }
        return al;
    }
}
