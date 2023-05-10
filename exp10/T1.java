import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        /*--------------*/
        y = x * x;
        System.out.println(y + "=" + x + "*" + x);
        System.out.println(x + "*" + x + "=" + y);
    }
}