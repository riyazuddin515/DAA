package array;

import java.util.Arrays;

public class TripletSumOfAnArray {
    public static void main(String[] args) {
        int x = 13;
        int[] arr = {1, 4, 45, 6, 10, 8};
        int n = arr.length;
        boolean flag = false;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int l = i+1;
            int r = n-1;
            while(l<r){
                if(arr[i] + arr[l] + arr[r] == x){
                    flag = true;
                    break;
                } else if (arr[i] + arr[l] + arr[r] < x) {
                    l++;
                }else{
                    r--;
                }
            }
        }
        if(flag)
            System.out.print(1);
        else
            System.out.print(0);
    }
}
