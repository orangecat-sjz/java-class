import java.util.*;

public class T5 {
    public static void main(String[] args) {
        int ri, repeat, n, min, count, i;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            /*---------*/
            n = in.nextInt();
            count = 0;
            min = n;
            while (n != 999) {
                if (n < min) {
                    min = n;
                }
                if (isprime(n)) {
                    count++;
                }
                n = in.nextInt();
            }
            System.out.println("素数个数=" + count);
            System.out.println("最小值=" + min);
        }
    }

    public static boolean isprime(int n) {
        boolean flag = true;
        if (n <= 0) {
            flag = false;
        }
        if (n == 1) {
            flag = false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
