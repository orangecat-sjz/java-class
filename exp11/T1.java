import java.util.*;

public class T1 {
    public static void main(String[] args) {
        int ri, repeat;
        long n, t, m;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextLong();
            /*---------*/
            t = n;
            m = 0;
            while (t > 0) {
                t = t / 10;
                m = m + 1;
            }
            t = n;
            while (m > 3) {
                // System.out.println(t);
                System.out.print(t / (long) Math.pow(10, m - 1) + ",");
                t = t % (long) Math.pow(10, m - 1);
                m = m - 3;
            }
            if (m <= 3) {
                System.out.println(t);
            }
        }
    }
}