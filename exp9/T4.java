import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        int ri, repeat;
        int a[][], i, j, n, sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n][n];
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    a[i][j] = in.nextInt();
            /*---------*/
            sum = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (i + j == n - 1 || i == n - 1 || j == n - 1) {
                        continue;
                    } else {
                        sum += a[i][j];
                    }
                }
            }
            System.out.println("sum=" + sum);
        }
    }
}