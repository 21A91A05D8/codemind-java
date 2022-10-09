import java.util.*;
class Navya{
    public static void main(String[] args)
    {
        Scanner anu=new Scanner(System.in);
        int n=anu.nextInt();
        int a[]=new int[100];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=anu.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if (a[i]%2==1)
            {
                c+=1;
            }
        }
        if(c<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }   
}