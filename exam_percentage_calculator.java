package KserOS;
import java.util.*;
public class exam_percentage_calculator
{
    void main(int pass,int uc)
    {    

        double Percentage;
        Scanner a=new Scanner(System.in);
        Scanner b=new Scanner(System.in);
        Scanner c=new Scanner(System.in);
        Scanner d=new Scanner(System.in);
        System.out.println("Are you an economics Student or a science student?\ntype 's' for science or type 'e' for economics");
        char a1=c.next().charAt(0);

        System.out.print("What have you taken as your elective?\n'CA' for Computer Application\n'PE' for physical education\n'HS' for Home Science\n'TD' for Technical Drawing\n'CM' for Commercial Applications\n'EA' for Economic Applications\n'A' for Art");
        String op=b.next();
        System.out.print("Your exams were out of: ");
        double Marks=a.nextDouble();
        System.out.print("\nYour English language Marks: ");
        double English_1=a.nextDouble();
        System.out.print("\nYour English Literature Marks: ");
        double English_2=a.nextDouble();
        System.out.print("\nYour Electives Marks: ");
        double Electives=a.nextDouble();
        System.out.print("\nYour Geography Marks: ");
        double Geography=a.nextDouble();
        System.out.print("\nYour History Marks: ");
        double History=a.nextDouble();
        System.out.print("\nYour Hindi Marks: ");
        double Hindi=a.nextDouble();
        System.out.print("\nYour Mathematics Marks: ");
        double Mathematics=a.nextDouble();
        double totalS=0;
        double Economics=0;
        int numberOfSubs=0;
        if(a1=='e')
        {
            System.out.print("\nYour Economics Marks: ");
            Economics=a.nextDouble();
            numberOfSubs=7;
        }
        else if(a1=='s')
        {

            System.out.print("\nYour Biology Marks: ");
            double Biology=a.nextDouble();
            System.out.print("\nYour Physics Marks: ");
            double Physics=a.nextDouble();
            System.out.print("\nYour Chemistry Marks: ");
            double Chemistry=a.nextDouble();
            totalS=Biology+Physics+Chemistry;
            numberOfSubs=10;
        }
        double Total_Marks;
        if(Marks==80)
        {
            Total_Marks=(English_1+English_2+Electives+History+Geography+Mathematics+totalS+Hindi+Economics); 
            Percentage=(Total_Marks/((Marks*numberOfSubs)+20)*100);
            System.out.println("Your Percentage is "+Percentage+"%\n"+"Your Total is "+Total_Marks+"/"+((Marks*numberOfSubs)+20));
            if (Percentage >35)
            {
                System.out.println("You have passed");
            }
            else
            {
                System.out.println("You have failed:(");
            }
        }
        else
        {
            Total_Marks=(English_1+English_2+Electives+History+Geography+totalS+Mathematics+Hindi+Economics); 
            Percentage=(Total_Marks/(Marks*numberOfSubs)*100);
            System.out.println("Your Percentage is "+Percentage+"%\n"+"Your Total is "+Total_Marks+"/"+(Marks*numberOfSubs));
            if (Percentage >35)
            {
                System.out.println("You have passed");
            }
            else
            {
                System.out.println("You have failed:(");
            }
        }
        System.out.println("*TYPE THE NUMBER ASSOCIATED WITH THE ACTION YOU WANT TO DO*");
        System.out.println("1.Calculate again\n2.Go Back");
        int option=0;
        int narka=0;
        do
        {
            option=d.nextInt();
            switch(option)
            {
                case 1:
                {
                    System.out.print("\f");
                    main(pass,uc);
                    narka=1;
                    break;
                }
                case 2:
                {
                    User go=new User();
                    narka=1;
                    d.close();
                    System.out.print("\f");
                    go.DoNotRun(pass,uc);
                    break;
                }
                default:
                {
                    System.out.println("Invalid option");
                    break;
                }
            }
        }
        while(narka==0);
    }
}