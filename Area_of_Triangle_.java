import java.util.*;
class Navya
{
    public static void main(String args[])
    {
        int r;
        Scanner anu=new Scanner(System.in);
        double a,b,c,s,ans;
        a=anu.nextDouble();
        b=anu.nextDouble();
        c=anu.nextDouble();
        s=(a+b+c)/2;
        ans=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ans);
    }
}