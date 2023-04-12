import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        int ri, repeat;
        int digit;
        long n, temp, pow;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextLong();
            /*---------*/
            if (n < 0) {
                n = -n;
            }
            printdigit(n);
            System.out.println();
        }
    }

    public static void printdigit(long n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            printdigit(n / 10);
            System.out.print(" " + n % 10);
        }
    }
}