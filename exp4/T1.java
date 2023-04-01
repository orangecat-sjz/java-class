import java.util.*;

public class T1 {
    public static void main(String[] args) {
        int repeat, ri, score;
        String grade;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            score = in.nextInt();
            /*---------*/
            if (score < 0 || score > 100) {
                grade = "Error";
            } else if (score < 60) {
                grade = "Fail";
            } else if (score >= 90) {
                grade = "Good";
            } else {
                grade = "Pass";
            }
            System.out.println(grade);
        }
    }
}
