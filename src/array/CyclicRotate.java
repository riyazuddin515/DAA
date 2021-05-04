package array;

public class CyclicRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int temp = arr[n-1];
        System.arraycopy(arr, 0, arr, 1, n - 1);
        arr[0] = temp;
        for(int a: arr)
            System.out.print(a + " ");
    }
}
