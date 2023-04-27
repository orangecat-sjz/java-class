import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, index, k, n, temp, a[];
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n];
            for (i = 0; i < n; i++)
                a[i] = in.nextInt();
            /*---------*/
            for (i = 0; i < n; i++) {
                for (k = i + 1; k < n; k++) {
                    if (a[i] < a[k]) {
                        temp = a[i];
                        a[i] = a[k];
                        a[k] = temp;
                    }
                }
            }
            for (i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}