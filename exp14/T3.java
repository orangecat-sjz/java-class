import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, n, a[];
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n];
            for (i = 0; i < n; i++)
                a[i] = in.nextInt();
            sort(a);
            for (i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }

    /*---------*/
    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
