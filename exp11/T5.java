import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        int ri, repeat, i;
        char ch;
        String str1, str2;
        Scanner in = new Scanner(System.in);
        repeat = (in.nextLine()).charAt(0) - '0';
        for (ri = 1; ri <= repeat; ri++) {
            str1 = in.nextLine();
            /*---------*/
            str2 = "";
            for (i = 0; i < str1.length(); i++) {
                ch = str1.charAt(i);
                if (ch - 'A' >= 0 && ch - 'Z' <= 0) {
                    ch = (char) (65 + 90 - ch);
                }
                str2 += ch;
            }
            System.out.println(str2);
        }
    }
}
