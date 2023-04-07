import java.util.Scanner;

public class Test40021 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, n;
        float s, t;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*--------------------*/
            s = 0;
            t = 0;
            int temp = 1;
            for (i = 1; i <= n; i++) {
                temp = temp * i;
                t = 1.0f / temp;
                s += t;
            }
            System.out.println((int) (s * 10000 + 0.5) / 10000.);
        }
    }
}