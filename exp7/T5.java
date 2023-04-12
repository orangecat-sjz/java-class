import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, n;
        double s;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*-----------*/
            s = 0;
            for (i = 1; i <= n; i++) {
                s += 1 / frac(i);
            }
            System.out.println((long) (s * 10000 + 0.5) / 10000.);
        }
    }

    /*---------------*/
    public static double frac(int n) {
        double res = 1.0;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}