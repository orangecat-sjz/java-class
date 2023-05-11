import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        int ri, repeat, i, number;
        char ch;
        String str;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            str = in.next();
            /*---------*/
            number = 0;
            int pow = 1;
            for (i = str.length() - 1; i >= 0; i--) {
                ch = str.charAt(i);
                if (ch - '0' >= 0 && ch - '9' <= 0) {
                    number += (ch - '0') * pow;
                    pow *= 16;
                }
                if (ch - 'a' >= 0 && ch - 'f' <= 0) {
                    number += (ch - 'a' + 10) * pow;
                    pow *= 16;
                }
                if (ch - 'A' >= 0 && ch - 'F' <= 0) {
                    number += (ch - 'A' + 10) * pow;
                    pow *= 16;
                }
            }
            System.out.println(number);
        }
    }
}
