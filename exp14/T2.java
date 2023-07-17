import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        int len, count, i, k;
        char ch;
        String str;
        Scanner in = new Scanner(System.in);
        str = in.next();
        /*---------*/
        count = 0;
        len = 0;
        for (i = 0; i < str.length();) {
            count = str.indexOf('#', i);
            if (count < 0) {
                break;
            } else {
                len = count - i;
                System.out.println(len);
                i = count + 1;
            }
        }
    }
}