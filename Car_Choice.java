import java.util.*;
class Navya{
    public static void main(String args[])
    {
        Scanner anu=new Scanner(System.in);
        int t=anu.nextInt();
        while(t!=0)
        {
            double a = anu.nextInt();
		    double b = anu.nextInt();
		    double c = anu.nextInt();
		    double d = anu.nextInt();
		    double e =c/a;
		    double f =d/b;
		    if(e<f){
		        System.out.println("-1");
		    }
		    else if(f<e)
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
        }
    }
}