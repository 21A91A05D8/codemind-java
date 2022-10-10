import java.util.*;
class Navya{
    public static void main(String[] args)
    {
        Scanner anu=new Scanner(System.in);
        int t=anu.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=anu.nextInt();
            int b=anu.nextInt();
            int r=0,v=0;
            for(int j=a;j<=b;j++)
            {
                r=j%10;
                if((r==2) || (r==3) || (r==9))
                {
                    v+=1;
                }
            }
            System.out.println(v);
        }
    }
}