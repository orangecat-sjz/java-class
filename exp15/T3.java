import java.util.*;
public class T3 {
    public static void main(String[] args) {
        int i,n,a,b,c;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=1;i<=n;i++){
            a=in.nextInt();b=in.nextInt();c=in.nextInt();
            System.out.println("max(a,b)="+Compare.max(a,b));
            System.out.println("max(a,b,c)="+Compare.max(a,b,c));
        }
    }
}
class Compare{
    public static int max(int a,int b)
    {
        if(a>=b)
            return a;
        else
            return b;
    }
    public static int max(int a,int b,int c)
    {
        int max=0;
        if(a>=b)
            max=a;
        else
            max=b;
        if(max>=c)
            return max;
        else
            return c;
    }
}
