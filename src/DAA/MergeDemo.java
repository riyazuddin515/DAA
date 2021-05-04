package DAA;

public class MergeDemo {
    int[] a = {50, 30, 80, 90, 10, 70, 20, 40, 60, 100};
    int[] b = new int[a.length];

    public static void main(String[] args) {
        MergeDemo mergeDemo = new MergeDemo();
        mergeDemo.mergeSort(0, mergeDemo.a.length - 1);
        mergeDemo.print();
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) {
        int h = low, i = low, j = mid + 1;
        while ((h <= mid) && (j <= high)) {
            if (a[h] <= a[j]) {
                b[i] = a[h];
                h++;
            } else {
                b[i] = a[j];
                j++;
            }
            i++;
        }
        if (h > mid) {
            for (int k = j; k <= high; k++) {
                b[i] = a[k];
                i++;
            }
        } else {
            for (int k = h; k <= mid; k++) {
                b[i] = a[k];
                i++;
            }
        }
        for (int k = low; k <= high; k++) {
            a[k] = b[k];
        }
    }

    private void print() {
        for (int e : a) {
            System.out.println(e);
        }
    }
}
