package KserOS;
import java.util.Scanner;
class calculator
{
    Scanner a=new Scanner(System.in);
    Scanner b1=new Scanner(System.in);
    void calculateold(int pass,int uc)
    {
        double result=0;char o=' ';int h=0;
        do
        {

            double $1=a.nextDouble();
            char sign1=a.next().charAt(0);
            double $2=a.nextDouble();
            if(sign1=='+')
            {
                result=$1+$2;    

            }
            if(sign1=='-')
            {
                result=$1-$2;

            }
            if(sign1=='/')
            {
                result=$1/$2;

            }
            if(sign1=='*')
            {
                result=$1*$2; 
            }
            char sign2=a.next().charAt(0);
            if(sign2=='=')
            {
                System.out.println(result);
                System.out.println("Do you want to exit application, if yes type Y or else type N");
                o=b1.next().charAt(0);
                if(o=='Y'||o=='y')
                {
                    System.out.print("\f");
                    h++;

                }
                if(o=='n'||o=='N')
                {
                    h=0;
                }
            }

            else 
            {
                double $3=a.nextDouble();
                if(sign2=='+')
                {
                    System.out.println(result+$3);
                }
                if(sign2=='-')
                {
                    System.out.println(result-$3);
                }
                if(sign2=='/')
                {
                    System.out.println(result/$3);
                }
                if(sign2=='*')
                {
                    System.out.println(result*$3);
                }

            }

        }
        while(h<1);
        User qq=new User();
        qq.DoNotRun(pass,uc);
    }

    void calculate(int pass,int uc)
    {
        int h=0;
        System.out.println("Syntax:1/1*1+1-1=\nThis calculator does not follow BODMAS Sorry:(");
        do
        {
            Scanner sc=new Scanner(System.in);
            String equation=sc.nextLine();
            equation="+"+equation;
            String[] digits=new String[equation.length()];
            int firstin=0;
            int secondin=0;
            int check=0;
            char a=' ';
            int check1=0;
            int digitlength=0;
            char[] type=new char[equation.length()];
            int counter=0;
            for(int lp=0;lp<equation.length();lp++)
            {
                a=equation.charAt(lp);
                if(a=='+'||a=='-'||a=='*'||a=='/')
                {
                    if(check==0)
                    {
                        firstin=lp+1;
                        check=1;
                    }
                    else if(check==1)
                    {
                        secondin=lp;
                        digits[digitlength]=equation.substring(firstin,secondin);
                        digitlength++;
                        lp=lp-1;
                        check=0;
                    }
                }
                else if(a=='=')
                {
                    secondin=lp;
                    digits[digitlength]=equation.substring(firstin,secondin);
                }
                char aa=equation.charAt(lp);
                if(aa=='/'||aa=='*'||aa=='+'||aa=='-'||aa=='=')
                {
                    if(aa=='/')
                    {

                        type[counter]='/';
                    }
                    else if(aa=='*')
                    {

                        type[counter]='*';
                    }
                    else if(aa=='+')
                    {

                        type[counter]='+';
                    }
                    else if(aa=='-')
                    {

                        type[counter]='-';
                    }
                    else if(aa=='=')
                    {

                        type[counter]='=';
                    }
                    counter++;
                }
            }
            double answer=0.0;
            double firstnumber=Double.parseDouble(digits[0]);
            double secondnumber=0.0;
            for(int lk=1;lk<counter;lk++)
            {
                if(lk!=1)
                {
                    firstnumber=0.0+answer;
                    secondnumber=0.0;
                }
                if(type[lk]=='+')
                {
                    secondnumber=secondnumber+Double.parseDouble(digits[lk]);
                    answer=firstnumber+secondnumber;
                }
                else if(type[lk]=='-')
                {
                    secondnumber=secondnumber+Double.parseDouble(digits[lk]);
                    answer=firstnumber-secondnumber;
                }
                else if(type[lk]=='/')
                {

                    secondnumber=secondnumber+Double.parseDouble(digits[lk]);
                    answer=firstnumber/secondnumber;
                }
                else if(type[lk]=='*')
                {

                    secondnumber=secondnumber+Double.parseDouble(digits[lk]);
                    answer=firstnumber*secondnumber;
                }
                if(type[lk]=='=')
                {
                    System.out.println(firstnumber);
                }
            }
            System.out.println("Do you want to exit application, if yes type Y or else type N");
            char o=b1.next().charAt(0);
            if(o=='Y'||o=='y')
            {
                System.out.print("\f");
                h++;

            }
            if(o=='n'||o=='N')
            {
                h=0;
            }
        }
        while(h==0);
        User qq=new User();
        qq.DoNotRun(pass,uc);
    }
}
