import java.util.Scanner;

public class Test30009 {
    public static void main(String args[]) {
        int repeat, ri;
        int a, b, c, d;
        double x1, x2;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = b * b - 4 * a * c;
            /*---------*/
            if (a == 0 && b == 0 && c == 0) {
                System.out.println("a=b=c=0,meaningless");
            } else if (a == 0 && b == 0 && c != 0) {
                System.out.println("a=b=0,c!=0,error");
            } else if (a == 0) {
                x1 = -1.0 * c / b;
                x1 = Math.round(x1 * 100.0) / 100.0;
                System.out.println("x=" + x1);
            } else if (d == 0) {
                x1 = -b / (2.0 * a);
                x1 = Math.round(x1 * 100.0) / 100.0;
                System.out.println("x=" + x1);
            } else if (d > 0) {
                x1 = (-b * 1.0 + Math.sqrt(d)) / (2.0 * a);
                x1 = Math.round(x1 * 100.0) / 100.0;
                System.out.println("x1=" + x1);
                x2 = (-b * 1.0 - Math.sqrt(d)) / (2.0 * a);
                x2 = Math.round(x2 * 100.0) / 100.0;
                System.out.println("x2=" + x2);
            } else {
                x1 = -b / (2.0 * a);
                x1 = Math.round(x1 * 100.0) / 100.0;
                x2 = Math.sqrt(-d) / (2.0 * a);
                x2 = Math.round(x2 * 100.0) / 100.0;
                System.out.println("x1=" + x1 + "+" + x2 + "i");
                System.out.println("x2=" + x1 + "-" + x2 + "i");
            }
        }
    }
}
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1
// 1