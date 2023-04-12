import java.util.Scanner;

public class T9 {
    public static void main(String args[]) {
        int ri, repeat;
        long n, res;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*---------*/
            res = reverse(n);
            System.out.println(res);
        }
    }

    /*---------*/
    public static long reverse(long n) {
        int flag = 1;
        if (n < 0) {
            n = -n;
            flag = -1;
        }
        long res = 0;
        while (n != 0) {
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res * flag;
    }
}
