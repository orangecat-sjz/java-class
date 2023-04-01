import java.util.Scanner;

public class Test40012 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, n, a, sn, tn;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            a = in.nextInt();
            n = in.nextInt();
            /*--------------------*/
            sn = 0;
            tn = a;
            for (i = 1; i <= n; i++) {
                sn += a;
                a = a * 10 + tn;
            }
            System.out.println(sn);
        }
    }
}
