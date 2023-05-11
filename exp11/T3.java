import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        int count, i, j, n;
        char ch;
        String str;
        Scanner in = new Scanner(System.in);
        n = (in.nextLine()).charAt(0) - '0';
        for (i = 1; i <= n; i++) {
            str = in.nextLine();
            /*---------*/
            count = 0;
            for (j = 0; j < str.length(); j++) {
                ch = str.charAt(j);
                if (ch - 'A' >= 0 && ch - 'Z' <= 0) {
                    if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
