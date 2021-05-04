package array;

public class MaxSubArrayProduct {
    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        int[] arr1 = {2, 3, 4, 5, -1, 0};
        int[] arr2 = {8, -2, -2, 0, 8, 0, -6, -8, -6, -1};
        int[] arr3 = {0, 2, 1, 7};
        int[] arr4 = {-8, 5, 3, 1, 6};
        int[] arr5 = {4, -5, 9};
        System.out.println(maxProduct(arr, arr.length));
        System.out.println(maxProduct(arr1, arr1.length));
        System.out.println(maxProduct(arr2, arr2.length));
        System.out.println(maxProduct(arr3, arr3.length));
        System.out.println(maxProduct(arr4, arr4.length));
        System.out.println(maxProduct(arr5, arr5.length));
    }
    private static long maxProduct(int[] arr, int n) {
        int min = arr[0];
        int max = arr[0];
        int maximumProduct = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < 0){
                int temp = min;
                min = max;
                max = temp;
            }
            min = Math.min(arr[i], min*arr[i]);
            max = Math.max(arr[i], max*arr[i]);

            maximumProduct = Math.max(maximumProduct, max);
        }
        return maximumProduct;
    }

    private static long maxSubArrayProduct(int[] arr, int n){
        int max = arr[0];
        int min = arr[0];
        int final_max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                int temp = min;
                min = max;
                max = temp;
            }
            min = Math.min(arr[i], min * arr[i]);
            max = Math.max(arr[i], max * arr[i]);

            final_max = Math.max(final_max, max);
        }
        return final_max;
    }
}
