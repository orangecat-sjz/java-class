import java.util.Scanner;

public class T7 {
    public static void main(String args[]) {
        int ri, repeat, n;
        boolean flag;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*---------*/
            flag = prime(n);
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    /*------------*/
    public static boolean prime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
