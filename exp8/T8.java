import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, index, n, t, a[];
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n];
            for (i = 0; i < n; i++)
                a[i] = in.nextInt();
            /*---------*/
            int maxindex = n - 1;
            int minindex = 0;
            for (i = 0; i < n; i++) {
                if (a[i] < a[minindex]) {
                    minindex = i;
                } else if (a[i] > a[maxindex]) {
                    maxindex = i;
                }
            }
            t = a[minindex];
            a[minindex] = a[0];
            a[0] = t;
            if (maxindex != 0) {
                t = a[maxindex];
                a[maxindex] = a[n - 1];
                a[n - 1] = t;
            }
            for (i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}