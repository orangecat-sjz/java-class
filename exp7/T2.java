import java.util.*;

public class T2 {
    public static void main(String[] args) {
        int ri, repeat, m, n, i, t;
        boolean f;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            /*---------*/
            for (i = m; i <= n; i++) {
                t = i;
                f = false;
                while (t != 0) {
                    if (t % 10 == 0) {
                        f = true;
                        break;
                    }
                    t = t / 10;
                }
                if (i == 0) {
                    f = true;
                }
                if (f) {
                    System.out.print(i + ",");
                }
            }
            System.out.println();
        }
    }
}
