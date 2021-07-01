
package KserOS;

import java.util.*;
public class User
{
    void run()
    {
        Scanner b=new Scanner(System.in);
        int narka=0;
        int epass=0;
        System.out.print("IF YOU WANT TO SHUTDOWN THE CODE TYPE 'S'\nEnter User Code: ");
        String CharCoder=b.next().trim();
        b.close();
        char CharCode=' ';
        int userCode=8776876;
        if(CharCoder.charAt(0)=='S'||CharCoder.charAt(0)=='s')
        {
            System.out.print("\fShutting Down");

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
            }
            System.out.print("\f");
        }
        else if(Character.isDigit(CharCoder.charAt(0)))
        {
            userCode=Integer.parseInt(CharCoder);
            System.out.print("Enter Pin: ");
            Scanner a=new Scanner(System.in);

            narka=1;

            epass=a.nextInt();
            a.close();
        }
        else
        {
            System.out.println("\fError,sign in again");
            run();
        }

        if(narka==1)
        {
            System.out.print("\fLogging In");
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
            }
            System.out.print("\f");

            DoNotRun(epass,userCode);
        }
    }

    void DoNotRun(int epass,int userCode)
    {
        String userName="";
        byte o=0;
        byte v=0;
        calculator c1=new calculator();
        exam_percentage_calculator c2=new exam_percentage_calculator();
        EMI_calculator c3=new EMI_calculator();
        sentenceCleaner c4=new sentenceCleaner();
        Games c5=new Games();
        Start c6=new Start();

        Scanner a=new Scanner(System.in);

        if(pass(epass,3535)&&userCode==1)
        {
            v=1;
            userName="Admin";
        }
        else if(pass(epass,5889)&&userCode==2)
        {
            v=1;
            userName="Krishna";
        }
        else if(pass(epass,4321)&&userCode==3)
        { 
            v=1;
            userName="Nisha";
        }
        else if(pass(epass,6886)&&userCode==10)
        { 
            v=1;
            userName="Vedant";
        }
        else if(pass(epass,0000)&&userCode==0)
        { 
            v=1;
            userName="Guest";
        }
        else
        {
            System.out.print('\u000C');
            System.out.print("User Code or passcode is wrong\n");   
            run();   
        }

        int k=0;
        if(v==1)
        {

            System.out.println("*TYPE THE NUMBER ASSOCIATED WITH THE ACTION YOU WANT TO DO*");
            String option="1.Calculator\n2.Exam Percentage Calculator\n3.Emi Calculator\n4.Sentence Cleaner\n5.Game Menu\n6.Shut Down Options\n";
            for(int lp=0;lp<option.length();lp++)
            {
                System.out.print(option.charAt(lp));
                if(option.charAt(lp)=='\n')
                {
                    for(int lk=0;lk<=1100000;lk++)
                    {

                        System.out.print("");
                    }
                }
            }
        }
        do
        {
            if(v==1)
            {
                o=a.nextByte();
                if(o==1)
                {
                    System.out.print('\u000C');
                    k=1;
                    System.out.println("Welcome to Calculator "+userName);
                    c1.calculate(epass,userCode);
                }
                else if(o==2)
                {
                    System.out.print('\u000C');
                    System.out.println("Welcome to Exam Percentage Calculator "+userName);
                    k=1;
                    c2.main(epass,userCode);

                }
                else if(o==3)
                {
                    System.out.print('\u000C');
                    System.out.println("Welcome to Emi Calculator "+userName);
                    k=1;
                    c3.main(epass,userCode);
                }
                else if(o==4)
                {
                    System.out.print('\u000C');
                    System.out.println("Welcome to Sentence Cleaner "+userName);
                    k=1;
                    c4.main(epass,userCode);
                }
                else if(o==5)
                {
                    System.out.print('\u000C'); 
                    System.out.println("\fWelcome to Game Menu "+userName+"!");
                    k=1;
                    c5.IndexG(epass,userCode);
                }
                else if(o==6)
                {
                    System.out.print('\u000C');
                    String shutdownmenu="1.Shut Down The Code\n2.Log Off\n3.Cancel";
                    for(int lp=0;lp<shutdownmenu.length();lp++)
                    {

                        System.out.print(shutdownmenu.charAt(lp));
                        if(shutdownmenu.charAt(lp)=='\n')
                        {
                            for(int lk=0;lk<=1100000;lk++)
                            {

                                System.out.print("");
                            }
                        }
                    }
                    byte op=0;
                    int vv=0;
                    do
                    {
                        vv=0;
                        op=a.nextByte();
                        switch(op)
                        {

                            case 1:
                            {
                                System.out.print("\fShutting Down");
                                epass=0;
                                a.close();
                                userCode=0;
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
                                            System.out.print(".");
                                            break;
                                        }
                                        case 899900000:
                                        {
                                            System.out.print(".");
                                            break;
                                        }
                                    }
                                }
                                System.out.print("\fGoodbye "+userName);
                                v++;
                                k=1;
                                break;
                            }
                            case 2:
                            {
                                if(op==2)
                                {
                                    System.out.print("\fLogging Off");
                                    a.close();
                                    epass=0;
                                    userCode=0;
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
                                    }

                                    System.out.print("\f");

                                    k=1;
                                    v++;
                                    run();
                                    break;
                                }
                            }
                            case 3:
                            {
                                System.out.print("\f");
                                back(epass,userCode);
                                v++;
                                break;
                            }
                            default:
                            {
                                System.out.println("Invalid Option");

                                break;
                            }

                        }

                    }while(v==0);
                }
                else
                {
                    System.out.print("Invalid Option");
                }
            }
        }
        while(k==0);

    }

    void back(int epass,int userCode)
    {
        DoNotRun(epass,userCode);
    }

    boolean pass(int enteredpass,int yourPass)
    {
        boolean z11=false;

        if(enteredpass!=yourPass)
        {
            System.out.println('\u000C');
        }
        if(enteredpass==yourPass)
        {

            z11=true;
        }
        return z11;
    }

}
