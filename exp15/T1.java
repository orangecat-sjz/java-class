import java.util.Scanner;
public class T1{
    public static void main(String args[]) {
        int ri, repeat;
        int op1, op2, res;
        char operator;
        Scanner in=new Scanner(System.in);
        repeat=in.nextInt();
        for(ri=1; ri<=repeat; ri++){
            op1=in.nextInt();
            operator =(in.next()).charAt(0);
            res=0;
            while(operator!='=')
            {
                op2=in.nextInt();
                res=cal(op1,op2,operator);
                op1=res;
                operator=(in.next()).charAt(0);
            }
            res=op1;
    /*---------*/
            System.out.println(res);
        }
    }
    public static int cal(int a,int b,char op)
    {
        int res=0;
        switch(op)
        {
            case '+':res=a+b;break;
            case '-':res=a-b;break;
            case '*':res=a*b;break;
            case '/':res=a/b;break;
        }
        return res;
    }
}