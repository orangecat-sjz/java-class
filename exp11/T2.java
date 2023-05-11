import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, j, k, row, col, n, a[][];
        boolean flag;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n][n];
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    a[i][j] = in.nextInt();
            flag = false;
            row = 0;
            col = 0;
            for (i = 0; i < n; i++) {
                k = a[i][0];
                for (j = 0; j < n; j++) {
                    if (a[i][j] > k) {
                        col = j;
                        k = a[i][col];
                    }
                }
                // System.out.println(col);
                boolean f = true;
                for (j = 0; j < n; j++) {
                    if (a[j][col] < a[i][col]) {
                        f = false;
                    }
                }
                if (f) {
                    flag = true;
                    row = i;
                    break;
                } else {
                    col = 0;
                }
            }
            /*---------*/
            if (flag)
                System.out.println("a[" + row + "][" + col + "]=" + a[row][col]);
            else
                System.out.println("NO");
        }
    }
}
