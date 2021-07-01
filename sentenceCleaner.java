package KserOS;

import java.util.*; 
class sentenceCleaner
{
    void main(int pass,int uc)
    {
        User aps= new User();
        byte asd=0;
        do
        {
            System.out.print('\u000C');
            Scanner a=new Scanner(System.in);
            String a2="";
            char z=' ';
            asd=0;
            System.out.print("Enter the sentence you want to clean: ");
            String a1=a.nextLine();

            for(int lp=0;lp<a1.length();lp++)
            {
                z=a1.charAt(lp);
                if(Character.isLetter(z)||z==' ')
                {
                    a2=a2+z;
                }
            }
            System.out.println("Your Cleaned sentence is: "+a2);
            System.out.println("Do you want to leave the program?\nIf yes type \"Y\" or else type anything");
            String ans=a.next();
            System.out.print("\f");
            if(ans.equalsIgnoreCase("Y"))
            {
                aps.DoNotRun(pass,uc);
                asd++;
            }
        }while(asd<1);
    }
}