import java.util.Scanner;

public class Test40011 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, n;
        float a, b, s, t;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*--------------------*/
            a = 2.0f;
            b = 1.0f;
            s = 0.0f;
            for (i = 1; i <= n; i++) {
                s += a / b;
                t = a;
                a = a + b;
                b = t;
            }
            System.out.println((int) (s * 10000 + .5) / 10000.);
        }
    }
}