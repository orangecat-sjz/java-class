import java.util.*;

public class Test40095 {
    public static void main(String[] args) {
        int ri, repeat, n, i;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.print(n + "=");
                    break;
                }
            }
            if (i == n) {
                System.out.println(n + "isprime");
                n = 0;
            }
            for (i = 2; i <= n; i++) {
                while (n % i == 0 && n != i) {
                    System.out.print(i + "*");
                    n = n / i;
                }
                if (i == n)
                    System.out.print(i);
            }
        }
    }
}
