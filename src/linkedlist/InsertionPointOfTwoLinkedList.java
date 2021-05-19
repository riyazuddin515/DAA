package linkedlist;

public class InsertionPointOfTwoLinkedList {
    public static void main(String[] args) {

        Test h3 = new Test(15);
        h3.next = new Test(30);

        Test h1 = new Test(3);
        h1.next = new Test(6);
        h1.next.next = new Test(9);
        h1.next.next.next = h3;

        Test h2 = new Test(10);
        h2.next = h3;

        System.out.println(intersectionPoint(h1, h2));

    }

    private static int intersectionPoint(Test temp1, Test temp2) {

        Test l = temp1;
        Test m = temp2;

        int a = 0;
        int b = 0;

        while (temp1 != null) {
            a++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            b++;
            temp2 = temp2.next;
        }

        int abs = Math.abs(a - b);
        Test temp3 = (a >= b)? l : m;

        Test temp4 = (temp3 == l)? m: l;

        while (abs != 0) {
            temp3 = temp3.next;
            abs--;
        }


        while (temp3 != null && temp4 != null) {
            if (temp3.next == temp4.next) {
                return temp3.next.data;
            }
            temp3 = temp3.next;
            temp4 = temp4.next;
        }

        return -1;
    }

}

class Test{
    int data;
    Test next;

    Test(int data) {
        this.data = data;
    }
}
