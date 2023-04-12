import java.util.*;

public class T1 {
    public static void main(String[] args) {
        int ri, repeat, n, i, flag;
        double t, s;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*---------*/
            flag = 1;
            s = 0;
            for (i = 1; i <= n; ++i) {
                t = 1;
                for (int j = 1; j <= i; ++j) {
                    t *= j;
                }
                s += flag * t;
                flag = -flag;
            }
            System.out.println("s=" + s);
        }
    }
}