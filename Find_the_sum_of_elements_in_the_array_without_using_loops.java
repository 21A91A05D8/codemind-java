import java.util.Scanner;
class Navya{
    public static void main(String[] args)
    {
        Scanner anu = new Scanner(System.in);
        int a=anu.nextInt();
        int sum=0;
        int arr[] = new int[100];
        for(int i=0;i<a;i++)
        {
            arr[i]=anu.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
        
    }
}