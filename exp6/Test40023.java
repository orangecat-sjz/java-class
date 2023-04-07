import java.util.Scanner;

public class Test40023 {
    public static void main(String args[]) {
        int ri, repeat;
        int count, i, j, k, m, n, sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            /*---------------------*/
            count = 0;
            sum = 0;
            for (i = m; i <= n; i++) {
                k = 1;
                for (j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        k = 0;
                    }
                }
                if (k == 1 && i != 1) {
                    count++;
                    sum += i;
                }
            }
            System.out.println("count=" + count + ", sum=" + sum);
        }
    }
}
