import java.util.Scanner;

public class T2 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, n, a;
        long sn;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            a = in.nextInt();
            n = in.nextInt();
            /*------------*/
            sn = 0;
            for (i = 1; i <= n; i++) {
                sn += fn(a, i);
            }
            System.out.println(sn);
        }
    }

    /*------------*/
    public static int fn(int a, int n) {
        int temp = a;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                temp = a;
            } else {
                temp = temp * 10 + a;
            }
        }
        return temp;
    }
}