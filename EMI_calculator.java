package KserOS;
import java.util.Scanner;
public class EMI_calculator
{

    public static void main(int pass,int uc)
    {
        int ll=0;
        do
        {
            double EMI;
            Scanner a= new Scanner(System.in);
            Scanner b= new Scanner(System.in);
            System.out.print ("Enter Loan Amount:");
            double loan_amount= a.nextFloat();
            System.out.print ("Enter Tenure (in years):");
            double Tenure=a.nextFloat();
            System.out.print ("Enter intrest:");
            double intrest=a.nextFloat();
            intrest= intrest/(12*100);
            Tenure= Tenure*12;
            EMI= (loan_amount*intrest*Math.pow(1+intrest,Tenure))/(Math.pow(1+intrest,Tenure)-1);
            System.out.print ("Your EMI is = "+ EMI+"\n");
            System.out.println("Do you want to exit application, if yes type yes or else type anything");
            String aaa=a.next();
            if(aaa.equals("yes")||aaa.equals("Yes")||aaa.equals("YES"))
            {
                ll++;
                System.out.print("\f");
            }
            else
            {
             System.out.print("\f");   
            }
        }
        while(ll<1);
        User n=new User();
        n.DoNotRun(pass,uc);
    }
}
