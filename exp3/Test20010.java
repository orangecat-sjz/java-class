import java.util.Scanner;

public class Test20010 {
    public static void main(String args[]) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        /*------------------------*/
        int res = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + res);
        res = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + res);
        res = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + res);
        res = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + res);
        res = num1 % num2;
        System.out.println(num1 + "%" + num2 + "=" + res);
    }
}
