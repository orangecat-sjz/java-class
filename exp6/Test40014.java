import java.util.*;

public class Test40014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gcd, lcm, m, n, r;
        int repeat, ri;
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            if (m <= 0 || n <= 0)
                System.out.println("m <= 0 or n <= 0");
            else {
                /*---------*/
                lcm = 0;
                gcd = 0;
                int s1 = m;
                int s2 = n;
                if (m < n) {
                    s1 = n;
                    s2 = m;
                }
                r = s1 % s2;
                while (r != 0) {
                    r = s1 % s2;
                    if (r == 0) {
                        break;
                    }
                    s1 = s2;
                    s2 = r;
                }
                gcd = s2;
                lcm = m * n / gcd;
                System.out.println("the least common multiple:" + lcm + ", the greatest common divisor:" + gcd);
            }
        }
    }
}
