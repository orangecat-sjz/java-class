import java.util.Scanner;

public class Test40031 {
    public static void main(String[] args) {
        int ri, repeat, count, word, i;
        String line;
        char c;
        Scanner in = new Scanner(System.in);
        repeat = (in.nextLine()).charAt(0) - '0'; // 输入repeat
        for (ri = 1; ri <= repeat; ri++) {
            line = in.nextLine(); // 输入一行字符
            /*---------*/
            count = 0;
            for (i = 0; i < line.length(); i++) {
                c = line.charAt(i);
                if (c == ' ') {
                    continue;
                } else {
                    while (c != ' ' && i < line.length() - 1) {
                        i++;
                        c = line.charAt(i);
                    }
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
