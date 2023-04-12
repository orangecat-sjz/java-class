import java.util.Scanner;

public class T8 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, m, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            /*---------*/
            for (i = m; i <= n; i++) {
                if (i == factorsum(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    /*---------*/
    public static int factorsum(int n) {
        int sum = 0;
        if (n == 1) {
            sum = 1;
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}