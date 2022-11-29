import java.util.*;
class testcases{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt(); 
        int car1=n1+x,car2=n2,t=0;
        if(n1>n2)
        {
            System.out.print("-1" ); 
            
        } 
        else 
        { 
            while(car1>=car2)
            {
                t++;
                car1+=n1;
                car2+=n2;
                
            } 
            System.out.print(t+1);
            }
            }
    
}