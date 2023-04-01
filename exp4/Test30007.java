import java.io.*;

public class Test30007 {
    public static void main(String[] args) throws IOException {
        char ch;
        ch = (char) System.in.read();
        while (ch != '?') {
            /*---------------------*/
            if (ch >= 65 && ch <= 90) {
                ch += (char) 32;
            } else if (ch >= 97 && ch <= 122) {
                ch -= (char) 32;
            }
            System.out.print(ch);
            ch = (char) System.in.read();
        }
    }
}