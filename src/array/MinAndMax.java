package array;

class Pair{
    int min;
    int max;
}
public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 0, 7, 8, 9};
        Pair pair = new Pair();
        pair.min = arr[0];
        pair.max = arr[0];

        if(arr.length > 1){
            for (int i = 1; i <= arr.length - 1; i++) {
                if(arr[i] < pair.min)
                    pair.min = arr[i];
                if(arr[i] > pair.max)
                    pair.max = arr[i];
            }
        }

        System.out.println("Min : "+pair.min);
        System.out.println("Max : "+pair.max);
    }
}
