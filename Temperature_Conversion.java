import java.util.Scanner;
class Navya {
    public static void main(String args[])
    {
        Scanner anu=new Scanner(System.in);
        double c=anu.nextInt();
        double f=(c*9/5)+32;
        System.out.format("%.2f",f);
    }
}