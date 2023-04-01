import java.util.Scanner;

public class Test40009 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, max, n, x;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*--------------------*/
            max = 0;
            for (i = 0; i < n; i++) {
                x = in.nextInt();
                if (i == 0) {
                    max = x;
                } else if (max < x) {
                    max = x;
                }
            }
            System.out.println(max);
        }
    }
}
