package array;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_so_far = 0;
        int max_ending_here = 0;
        for (int j : arr) {
            max_ending_here += j;
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        System.out.print(max_so_far);
    }
}
