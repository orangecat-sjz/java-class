import java.util.Scanner;

public class T3 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, m, n;
        long f;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            /*---------*/
            f = 0;
            for (i = 1; fib(i) <= n; i++) {
                f = fib(i);
                if (f >= m) {
                    System.out.print(f + " ");
                }
            }
            System.out.println();
        }
    }

    /*------------*/
    public static long fib(int n) {
        long res;
        if (n == 1) {
            res = 1;
        } else if (n == 2) {
            res = 1;
        } else {
            res = fib(n - 1) + fib(n - 2);
        }
        return res;
    }
}
