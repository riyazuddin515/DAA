package DAA;

public class QuickSortDemo {
    int[] a = {50, 30, 10, 90, 80, 20, 40, 70};

    public static void main(String[] args) {
        QuickSortDemo quickSortDemo = new QuickSortDemo();
        quickSortDemo.quickSort(0, 7);
        quickSortDemo.print();
    }

    private void quickSort(int p, int q) {
        if (p < q) {
            int j = partition(p, q);
            quickSort(p, j - 1);
            quickSort(j + 1, q);
        }
    }

    private int partition(int m, int p) {
        int pivot = a[p];
        int index = m;
        for (int i = m; i <= p - 1; i++) {
            if (a[i] <= pivot) {
                interchange(i, index);
                index++;
            }
        }
        interchange(index, p);
        return index;
    }

    private void interchange(int i, int j) {
        int p = a[i];
        a[i] = a[j];
        a[j] = p;
    }

    private void print() {
        for (int e : a)
            System.out.println(e);
    }
}
