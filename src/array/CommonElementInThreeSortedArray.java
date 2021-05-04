package array;

import java.util.ArrayList;
import java.util.Collections;

public class CommonElementInThreeSortedArray {
    public static void main(String[] args) {
        int n1 = 3;
        int[] arr1 = {3,3,3};
        int n2 = 3;
        int[] arr2 = {3,3,3};
        int n3 = 3;
        int[] arr3 = {3,3,3};

        ArrayList<Integer> re = commonElements(arr1, arr2, arr3, n1, n2, n3);
        for(Integer i: re)
            System.out.print(i + " ");
    }

    private static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1 && j < n2 && k < n3){
            if(A[i] == B[j] && B[j] == C[k]){
                if (!arr.contains(A[i])) {
                    arr.add(A[i]);
                }
                i++;
                j++;
                k++;
            }else if(A[i] < B[j]){
                i++;
            }else if(B[j] < C[k]){
                j++;
            }else{
                k++;
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
