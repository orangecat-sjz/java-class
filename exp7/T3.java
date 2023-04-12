import java.util.*;

public class T3 {
    public static void main(String[] args) {
        int ri, repeat, n, a, b, i, j;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*---------*/
            if (n < 6 || n % 2 != 0) {
                System.out.println(n + "不符合题目要求");
            } else {
                for (i = 3; i <= n / 2; i++) {
                    a = i;
                    b = n - i;
                    if (isprime(a) && isprime(b)) {
                        System.out.println(n + "=" + a + "+" + b);
                        break;
                    }
                }
            }
        }
    }

    public static boolean isprime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}