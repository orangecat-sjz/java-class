import java.util.Scanner;

public class Test20008 {
    public static void main(String[] args) {
        int money, year;
        double interest, rate;
        Scanner in = new Scanner(System.in);
        money = in.nextInt();
        year = in.nextInt();
        rate = in.nextDouble();
        interest = money * Math.pow(1 + rate, (double) year) - money;
        /*---------------*/
        System.out.println("interest = " + (int) (interest * 100 + 0.5) / 100.0);
    }
}
