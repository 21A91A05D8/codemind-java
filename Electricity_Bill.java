import java.util.*;
class Navya{
    public static void main(String args[])
    {
        Scanner anu=new Scanner(System.in);
        String id,name;
        int unit;
        float amt;
        id=anu.nextLine();
        name=anu.nextLine();
        unit=anu.nextInt();
        if (unit<200)
        amt=unit*1.20f;
        else if(unit>=200 && unit<400)
        amt=unit*1.50f;
        else if(unit>=400 && unit<600)
        amt=unit*1.80f;
        else
        amt=unit*2.00f;
        if (amt>400)
        {
            amt=amt+0.15f*amt;
        }
        else
        {
            amt=amt+100;
        }
        System.out.format("%.2f",amt);
    }
}