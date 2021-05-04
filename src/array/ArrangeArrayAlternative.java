package array;

import java.util.Arrays;

public class ArrangeArrayAlternative {
    public static void main(String[] args){
        int[] arr = {-5, -2, -5, 2, 4, 7, 1, -8};
        Arrays.sort(arr);
        int neg = 0, pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                neg++;
            }else{
                pos = arr.length - i;
                break;
            }
        }
        System.out.println("neg = "+neg);
        System.out.println("pos = "+pos);

        int i = 1;
        int j = neg;
        while(i < j && j<arr.length){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=2;
            j++;
        }
        for(int a: arr){
            System.out.print(a+" ");
        }

    }
    private static void arrange(int[] arr, int n){

    }
}
