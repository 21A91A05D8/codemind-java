import java.util.*;
class anu{
    public static void main(String args[])
    {
        Scanner navya=new Scanner(System.in);
        int n=navya.nextInt();
        int a=0;
        int b=1;
        System.out.printf("%d %d ",a,b);
        for(int i=2;i<n;i++)
        {
            int c=a+b;
            System.out.printf("%d ",c);
            a=b;
            b=c;
        }
    }
}