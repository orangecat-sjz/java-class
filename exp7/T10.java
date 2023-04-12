import java.util.Scanner;

public class T10 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*---------*/
            dectobin(n);
            System.out.println();
        }
    }

    /*---------*/
    public static void dectobin(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            dectobin(n / 2);
            System.out.print(n % 2);
        }
    }
}
