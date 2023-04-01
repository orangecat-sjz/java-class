import java.util.Scanner;

public class Test30008 {
    public static void main(String args[]) {
        int repeat, ri, x;
        double y;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            x = in.nextInt();
            /*---------*/
            if (x == 0) {
                y = 0.0;
            } else {
                y = 1.0 / x;
            }
            // System.out.println(y);
            if (Math.round(y * 10.0) * 10 == y * 100.0) {
                y = Math.round(y * 10) / 10.0;
                // System.out.println(y);
            } else {
                y = Math.round(y * 100) / 100.0;
                // System.out.println(y);
            }
            System.out.println("f(" + x + ")=" + y);
        }
    }
}
