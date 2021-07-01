package KserOS;

import java.util.*;
public class Start
{
    static void PowerOn()
    {
        System.out.print("KserOS Booting up");
        int aq=0;
        User abc=new User();
        for(int lp=0;lp<=1000000000;lp++)
        {

            switch(lp)
            {
                case 444444444:
                {
                    System.out.print(".");
                    break;
                }
                case 666666666:
                {
                    System.out.print( ".");
                    break;
                }
                case 899900000:
                {
                    System.out.print(".");
                    break;
                }
            }
            aq=lp;
        }
        if(aq==1000000000)
        {
            System.out.print("\f");
            abc.run();
        }
    }

    
}  