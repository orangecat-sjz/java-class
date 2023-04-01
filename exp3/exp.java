import java.util.Scanner;

public class exp {
    public static void main(String args[]) {
        double avg;
        int num1, num2, num3, num4;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        num4 = in.nextInt();
        avg = (num1 + num2 + num3 + num4) / 4.00;
        System.out.println("average=" + avg);
    }
}
