package array;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,0,0,2,0};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int j : arr) {
            if (j == 0)
                count0++;
            if (j == 1)
                count1++;
            if (j == 2)
                count2++;
        }

        for(int i = 0; i < arr.length; i++){
            if(count0 != 0){
                arr[i] = 0;
                count0--;
            }else if(count1 != 0){
                arr[i] = 1;
                count1--;
            }else if(count2 != 0){
                arr[i] = 2;
                count2--;
            }
        }
        for(int a: arr)
            System.out.print(a + " ");
    }
}
