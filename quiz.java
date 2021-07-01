package KserOS;

import java.util.*;
public class quiz
{
    Scanner no=new Scanner(System.in);
    int anss=0;
    double ans=0;
    Games aps=new Games();
    int points=0;
    Scanner word=new Scanner(System.in);
    short ans1=0;
    int ans2=0;
    void index(int pass,int uc)
    {
        ans1=0;
        ans2=0;
        anss=0;
        System.out.println("What kind of quiz do you want to play ?" );
        System.out.println("*TYPE THE NUMBER ASSOCIATED WITH THE ACTION YOU WANT TO DO*");
        System.out.println("1.Number Quiz\n2.Exit Program");
        ans1=no.nextShort();
        int verify=0;
        do
        {
            switch(ans1)
            {
                case 1:
                {
                    System.out.println('\u000C'+"Choose Difficulty Level\n*TYPE THE NUMBER ASSOCIATED WITH THE ACTION YOU WANT TO DO*");
                    System.out.println("1.Super Easy(A quiz without multiplication or division question)\n2.Easy(A quiz with multiplication or division question)\n3.Medium(A quiz tougher than Easy)");
                    ans2=no.nextInt();
                    switch(ans2)
                    {
                        case 1:
                        {
                            System.out.println('\u000C');
                            anss=ans2;
                            noQuiz(uc,pass);
                            break;
                        }
                        case 2:
                        {
                            System.out.println('\u000C');
                            anss=ans2;
                            noQuiz(uc,pass);
                            break;
                        }
                        case 3:
                        {
                            System.out.println('\u000C');
                            anss=ans2;
                            noQuiz(uc,pass);
                            break;
                        }
                    }
                    break;
                }
                case 2:
                {
                    System.out.print('\u000C');
                    aps.IndexG(pass,uc);
                    break;
                }
                default:
                {
                    break;
                }
            }
        }
        while(verify==1);
    }

    void noQuiz(int uc,int pass)
    {
        int qc=0;
        int no1=0;
        int  no2=0;
        int sign=0;
        char as=' ';
        double res=0;

        points=0;

        Random a=new Random();
        Random b=new Random();
        switch(anss)
        {
            case 1:
            {

                for(int lp=1;lp<=10;lp++)
                {
                    no1=a.nextInt(50)+1;
                    no2=a.nextInt(no1)+1;
                    sign=b.nextInt(2)+1;
                    switch(sign)
                    {
                        case 1:
                        {
                            as='+';
                            break;
                        }
                        case 2:
                        {
                            as='-';
                            break;
                        }
                    }
                    if(as=='+')
                    {
                        ans=no1+no2;
                    }
                    if(as=='-')
                    {
                        ans=no1-no2;
                    }

                    System.out.println(no1+""+as+""+no2+"=?");

                    res=no.nextInt();
                    if(res==ans)
                    {
                        System.out.println("Correct answer:)");
                        points++;
                    }
                    else
                    {
                        System.out.println("Wrong answer:/ \nThe correct answer is: "+ans);
                    }
                }
                if(points==10)
                {
                    System.out.println("Excellent You Got "+points+" points!!\nPRESS ANYTHING TO GO AHEAD");
                }
                else if(points<=9&&points>=7)
                {
                    System.out.println("Nice You Got "+points+" points:)\nPRESS ANYTHING TO GO AHEAD");
                }
                else if(points<=6&&points>=4)
                {
                    System.out.println("Not bad You Got "+points+" points:|\nPRESS ANYTHING TO GO AHEAD");
                }
                else if(points<=3&&points>=0)
                {
                    System.out.println(" You Got "+points+" points:(\nDont give up keep trying:)\nPRESS ANYTHING TO GO AHEAD");
                }
                else
                {
                    System.out.println("Something Went wrong in the code:(");
                    aps.IndexG(pass,uc);
                    break;
                }
                String qw=word.next();
                System.out.print('\u000C');
                if(qw!="hhhh#$&(")
                {
                    break;
                }
                else
                {
                    break;
                }
            }
            case 2:
            {

                for(int lp=1;lp<=10;lp++)
                {
                    no1=a.nextInt(50)+1;
                    no2=a.nextInt(no1)+1;
                    sign=b.nextInt(4)+1;
                    switch(sign)
                    {
                        case 1:
                        {
                            as='+';
                            break;
                        }
                        case 2:
                        {
                            as='-';
                            break;
                        }
                        case 3:
                        {
                            as='X';
                        }
                        case 4:
                        {
                            as='÷';
                        }
                    }
                    if(as=='+')
                    {
                        ans=no1+no2;
                    }
                    if(as=='-')
                    {
                        ans=no1-no2;
                    }
                    if(as=='X')
                    {
                        ans=no1*no2;
                    }
                    if(as=='÷')
                    {
                        int cc=0;
                        do
                        {
                            if(no1%no2==0)
                            {
                                cc=1;
                            }
                            else
                            {
                                no2=a.nextInt(no1)+1;
                            }
                        }
                        while(cc==0);
                        ans=no1/no2;
                    }

                    System.out.println(no1+""+as+""+no2+"=?");

                    res=no.nextDouble();
                    if(res==ans)
                    {
                        System.out.println("Correct answer:)");
                        points++;
                    }
                    else
                    {
                        System.out.println("Wrong answer:/ \nThe correct answer is: "+ans);
                    }
                }
                if(points==10)
                {
                    System.out.println("Excellent You Got "+points+" points!!\nPRESS ANYTHING TO GO AHEAD");
                }
                else if(points<=9&&points>=7)
                {
                    System.out.println("Nice You Got "+points+" points:)\nPRESS ANYTHING TO GO AHEAD");
                }
                else if(points<=6&&points>=4)
                {
                    System.out.println("Not bad You Got "+points+" points:|\nPRESS ANYTHING TO GO AHEAD");
                }
                else if(points<=3&&points>=0)
                {
                    System.out.println(" You Got "+points+" points:(\nDont give up keep trying:)\nPRESS ANYTHING TO GO AHEAD");
                }
                else
                {
                    System.out.println("Something Went wrong in the code:(");
                    aps.IndexG(pass,uc);

                }

                ans1=0;
                ans2=0;
                anss=0;
                index(pass,uc);
                break;
            }
            case 3:
            {
                int o1=0;
                int o2=0;
                for(int lp=1;lp<=10;lp++)
                {
                    o1=a.nextInt(50)+1;
                    o2=a.nextInt(50)+1;
                    sign=b.nextInt(4)+1;
                    switch(sign)
                    {
                        case 1:
                        {
                            as='+';
                            break;
                        }
                        case 2:
                        {
                            as='-';
                            break;
                        }
                        case 3:
                        {
                            as='X';
                            break;
                        }
                        case 4:
                        {
                            as='÷';
                            break;
                        }
                    }
                    if(as=='+')
                    {
                        ans=o1+o2;
                    }
                    if(as=='-')
                    {
                        ans=o1-o2;
                    }
                    if(as=='X')
                    {
                        ans=o1*o2;
                    }
                    if(as=='÷')
                    {
                        int cc=0;
                        int apa=a.nextInt(2)+1;
                        do
                        {
                            if(o1%o2==0||o2%o1==0)
                            {
                                cc=1;
                            }
                            else
                            {
                                if(apa==1)
                                {

                                    o2=a.nextInt(o1)+1;
                                }
                                else if(apa==2)
                                {
                                    o1=a.nextInt(o2)+1;
                                }
                            }
                        }
                        while(cc==0);
                        ans=o1/o2;
                    }

                    System.out.println(o1+""+as+""+o2+"=?");

                    if(res==ans)
                    {
                        System.out.println("Correct answer:)");
                        points++;
                    }
                    else
                    {
                        System.out.println("Wrong answer:/ \nThe correct answer is: "+ans);
                    }
                }
                if(points==10)
                {
                    System.out.println("\fExcellent You Got "+points+" points!!\nPRESS ANYTHING TO GO AHEAD");
                }
                else if(points<=9&&points>=7)
                {
                    System.out.println("\fNice You Got "+points+" points:)\nPRESS ANYTHING TO GO AHEAD");
                }
                else if(points<=6&&points>=4)
                {
                    System.out.println("\fNot bad You Got "+points+" points:|\nPRESS ANYTHING TO GO AHEAD");
                }
                else if(points<=3&&points>=0)
                {
                    System.out.println("\f You Got "+points+" points:(\nDont give up keep trying:)\nPRESS ANYTHING TO GO AHEAD");
                }
                break;
            }
        }

        ans1=0;
        ans2=0;
        anss=0;
        index(pass,uc);

    }
}