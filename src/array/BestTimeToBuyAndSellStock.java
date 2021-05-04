package array;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;
        System.out.print(bestTime(arr, n));
    }

    private static int bestTime(int[] arr, int n) {
        int maxProfit = 0;
        int minPrice = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }else if(arr[i] - minPrice > maxProfit){
                maxProfit = arr[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
