import java.util.Scanner;

public class T6 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, m, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            /*---------*/
            for (i = m; i <= n; i++) {
                if (is(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    /*---------*/
    public static boolean is(int i) {
        boolean flag = false;
        int digit = 0;
        int temp = i;
        int sum = 0;
        while (i > 0) {
            digit = i % 10;
            sum += digit * digit * digit;
            i = i / 10;
        }
        if (sum == temp) {
            flag = true;
        }
        return flag;
    }
}
