import java.util.*;
class Navya
{
    public static void main(String[] args)
    {
        Scanner anu=new Scanner(System.in);
        int hh,mm;
        double angle;
        String[] input;
        input=anu.nextLine().split(":");
        hh=Integer.parseInt(input[0]);
        mm=Integer.parseInt(input[1]);
        angle=Math.abs(30*hh-((11*mm)/2.0));
        if (angle<=180)
        {
            System.out.println(angle);
        }
        else
        {
            System.out.println(360-angle);
        }
    }
}