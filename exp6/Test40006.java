import java.util.Scanner;

public class Test40006 {
    public static void main(String[] args) {
        int ri, repeat;
        int temp, flag;
        double eps, item, sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            eps = in.nextDouble();
            /*--------------------*/
            temp = 1;
            flag = 1;
            sum = 0.0;
            while (1.0 / temp >= eps) {
                sum += flag * (1.0 / temp);
                temp = temp + 2;
                flag = -flag;
            }
            System.out.println((int) (sum * 10000 + 0.5) / 10000.);
        }
    }
}