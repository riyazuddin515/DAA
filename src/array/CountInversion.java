package array;

public class CountInversion {
    public static void main(String[] args) {
        long[] arr = {10, 10, 10};
        long n = arr.length;
        System.out.print(inversionCount(arr, n));
    }
    private static int inversionCount(long[] arr, long N) {
        int n = arr.length;
        long temp = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    count++;
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return count;
    }
}
