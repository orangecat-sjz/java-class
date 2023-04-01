import java.util.Scanner;

public class Test20011 {
    public static void main(String args[]) {
        int a, b, c, n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        /*------------------------*/
        a = n / 100;
        b = (n - a * 100) / 10;
        c = (n - a * 100 - b * 10);
        System.out.println("number" + n + ":digit1=" + c + ",digit2=" + b + ",digit3=" + a);
    }
}