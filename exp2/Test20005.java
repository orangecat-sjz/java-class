import java.util.Scanner;

public class Test20005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, digit1, digit2, digit3, digit4, newnum;
        number = in.nextInt();
        /*------------------*/
        digit1 = number / 1000;
        number = number - digit1 * 1000;
        digit1 = (digit1 + 9) % 10;
        digit2 = number / 100;
        digit2 = (digit2 + 9) % 10;
        number = number - digit1 * 100;
        digit3 = number / 10;
        digit3 = (digit3 + 9) % 10;
        number = number - digit1 * 10;
        digit4 = number;
        digit4 = (digit4 + 9) % 10;
        newnum = digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
        System.out.println("The encrypted number is " + newnum);
    }
}