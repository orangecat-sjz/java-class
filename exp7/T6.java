import java.util.Scanner;

public class T6 {
    public static void main(String args[]) {
        int ri, repeat;
        int count;
        long n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*---------*/
            if (n < 0) {
                n = -n;
            }
            count = countdigit(n, 2);
            System.out.println("count=" + count);
        }
    }

    /*------------*/
    public static int countdigit(long n, int d) {
        int count = 0;
        if (n == 0) {
            count++;
        }
        while (n != 0) {
            if (n % 10 == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}