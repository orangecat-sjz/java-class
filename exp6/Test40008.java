import java.util.Scanner;

public class Test40008 {
    public static void main(String[] args) {
        int ri, repeat;
        int x, sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            x = in.nextInt();
            /*--------------------*/
            sum = 0;
            while (x > 0) {
                if (x % 2 == 1) {
                    sum += x;
                }
                x = in.nextInt();
            }
            System.out.println(sum);
        }
    }
}
