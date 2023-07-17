import java.util.*;

public class T1 {
    public static void main(String[] args) {
        int ri, repeat, n, days, quantity;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*---------*/
            days = 1;
            quantity = 2;
            while (true) {
                quantity = 2 * quantity + 1;
                if (quantity <= n)
                    days++;
                else
                {
                    break;
                }
            }
            System.out.println("days=" + days);
        }
    }
}
