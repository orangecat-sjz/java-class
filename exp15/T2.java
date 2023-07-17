import java.util.Scanner;

public class T2 {
    public static void main(String args[])
    {
        int repeat=0;
        Scanner in = new Scanner(System.in);
        repeat=in.nextInt();
        String s1,s2;
        for(int i=0;i<repeat;i++)
        {
            s1=in.next();
            s2="";
            for(int j=0;j<s1.length();j++)
            {
                s2=s1.charAt(j)+s2;
            }
            System.out.println(s2);
        }
    }
}
