package array;

import java.util.Arrays;
public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 2, 3, 5, 7, 7, 7, 9, 9, 13, 13, 14, 14, 17, 17, 19, 20, 20};
        int[] arr2 = {3, 5, 7, 9, 10, 12, 13, 14, 20, 20,};
//        int[] arr1 = {1, 3, 5, 7};
//        int[] arr2 = {0, 2, 6, 8, 9};
        merge1(arr1, arr2, arr1.length, arr2.length);
    }

    public static void merge1(int[] arr1, int[] arr2, int n, int m){
        int i = n-1;
        int j = 0;
        while(i>=0 && j<m){
            if(arr1[i] > arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int a: arr1){
            System.out.print(a+" ");
        }
        System.out.println();
        for(int b: arr2){
            System.out.print(b+" ");
        }
    }

    public static void merge(int[] arr1, int[] arr2, int n, int m) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr2[j] < arr1[i]){
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        Arrays.sort(arr2);
        for(int a: arr1){
            System.out.print(a+" ");
        }
        System.out.println();
        for(int b: arr2){
            System.out.print(b+" ");
        }
    }
}
