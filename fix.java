package KserOS;
import java.util.*;
public class fix
{
    static void main(String n)
    {
        n="."+n;
        String[] digits=new String[n.length()];
        int firstin=0;
        int secondin=0;
        int check=0;
        char a=' ';
        String number="";
        int check1=0;
        for(int lp=0;lp<n.length();lp++)
        {
            a=n.charAt(lp);
            //".7546.8932.8903="
            if(a=='.')
            {
                if(check==0)
                {
                    firstin=lp+1;
                    check=1;
                }
                else if(check==1)
                {
                    secondin=lp;
                    System.out.println();
                    digits[check1]=n.substring(firstin,secondin);

                    lp=lp-1;

                    System.out.println(digits[check1]);
                    check=0;
                }
            }
            else if(a=='=')
            {
                secondin=lp;
                digits[check1]=n.substring(firstin,secondin);
                System.out.println(digits[check1]);
            }
        }
    }
}