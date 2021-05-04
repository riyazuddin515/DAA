package array;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 0, 1, 3, 2};
        int n = arr.length;

        int[] lArr = new int[n];
        int[] rArr = new int[n];

        lArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lArr[i] = Math.max(lArr[i-1], arr[i]);
        }

        rArr[n-1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rArr[i] = Math.max(rArr[i+1], arr[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(lArr[i], rArr[i]) - arr[i];
        }
        System.out.print(sum);
    }
}
