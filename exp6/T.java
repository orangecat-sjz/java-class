import java.util.*;

public class T {
    public static void main(String[] args) {
        int ri, repeat, m, n, i, flag;
        double s;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            /*---------*/
            s = 0.0;
            flag = 1;
            for (i = 1; i <= m; i++) {
                flag = (-1) * flag;
            }
            for (i = m; i <= n; i++) {
                s += 1.0 * flag / i;
                flag = -flag;
            }
            System.out.println("s=" + Math.round(s * 1000) / 1000.);
        }
    }
}
