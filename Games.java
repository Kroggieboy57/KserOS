 package KserOS;
import java.util.*;
class Games
{
    Scanner a=new Scanner(System.in);
    Scanner b=new Scanner(System.in);
    Scanner c=new Scanner(System.in);
    void IndexG(int pass,int uc)
    {
        System.out.println("Here You can see all the games you can play\nENJOY:)");
        System.out.print("1.Quiz Me\n2.Memory Test\n3.Go Back\n");
        byte option=0;

        quiz A1=new quiz();
        User A2=new User();
        int v=0;
        do
        {
            option=c.nextByte();
            v=0;
            switch(option)
            {
                case 1:
                {
                    System.out.print("\f");
                    A1.index(pass,uc);
                    option=0;
                    break;
                }
                case 2:
                {
                    MemoryTest(pass,uc); 
                    option=0;
                    break;   
                }
                case 3:
                {   
                    System.out.print("\f");
                    option=0;
                    A2.DoNotRun(pass,uc);
                    break;
                }
                default:
                {
                    v++;
                    System.out.print("Invalid Option\n");
                    break;
                }
            }
        }
        while(v!=0);
    }

    void helper()
    {
        int k1=0;
        int k2=0;
        String a1=a.nextLine();
        for(int lp=0;lp<a1.length();lp++)
        {
            char a2=a1.charAt(lp);
            String k3="";
            if(a2==',')
            {
                k3=a1.substring(k2,k1);
                System.out.print("\""+k3+"\",");
                k2=k1+1;
                k1=k2;

            }
            else
            {
                k1++;
            }
        }
    }

    void MemoryTest(int pass,int uc)
    {
        String[] wordbank={"tooth picks","clay pot","clothes","camera","rubber duck","hanger","fork","spring","chalk","toothpaste","picture frame","bed","shoe lace","greeting card","newspaper","CD","candle","mouse pad","stockings","pillow","pouch","twister","chapter book","shawl","plate","street lights","tree","water bottle","bananas","thread","cat","toilet","apple","hair brush","conditioner","car","bread","table","lotion","rusty nail","clamp","ring","soap","speakers","cookie jar","bracelet","shoes","purse","towel","brocolli","teddies","sofa","stop sign","credit card","soy sauce packet","carrots","toe ring","scotch tape","pen","flowers","helmet","fake flowers","house","sun glasses","perfume","button","outlet","blouse","key chain","sidewalk","computer","desk","flag","soda can","bottle cap","blanket","headphones","lip gloss","lace","nail file","washing machine","ipod","controller","drawer","keys","box","tire swing","tissue box","cell phone","truck","magnet","eye liner","sharpie","glow stick","USB drive","mp3 player","toothbrush","face wash","grid paper","tv","lamp shade","air freshener","playing cards","pencil","rubber band","food","milk","video games","puddle","window","checkbook","sketch pad","spoon","glass","thermostat","photo album","money","book","photo album","money","book","wagon","sponge","nail clippers","bowl","hair tie","beef","fridge","sticky note","peanuts","bow","slipper","balloon","remote","radio","bag","pool stick","leg warmers","wallet","twezzers","shampoo","keyboard","tomato","socks","ice cube tray","bookmark","vase","thermometer","deodorant","coasters","sand paper","paint brush","bottle","shirt","couch","chocolate","lamp","doll","television","phone","needle","canvas","clock","plastic fork","model car","chair","piano","eraser","buckel","sailboat","sandal","boom box","knife","watch","glasses","charger","screw","door","monitor","rug","floor","paper","candy wrapper","mop","zipper","cork"};
        String rules="\fWelcome to memory Test!\n Rules:\nYou will be asked to enter the number of words you want to be tested on. Random words will Be given to you and you have to memorise it within\nthree counts. Later you will be asked which was the first word,third word,second word etc. The order will be random\nGood Luck!\n";
        for(int lp=0;lp<rules.length();lp++)
        {

            System.out.print(rules.charAt(lp));
            for(int lk=0;lk<=1000000;lk++)
            {

                System.out.print("");
            }
            if(rules.charAt(lp)=='.')
            {
                for(int lo=0;lo<=10000000;lo++)
                {
                    System.out.print("");
                }
            }
        }
        System.out.println("How many words do you want to be tested on?"); 
        Random aq1=new Random();
        int no=a.nextInt();
        System.out.print("\f");
        String[] question=new String[no];
        String checkboi="";
        for(int lp=0;lp<question.length;lp++)
        {
            int aq2=aq1.nextInt(186-1);
            checkboi=wordbank[aq2];
            for(int lq=0;lq<question.length;lq++)
            {
                if(checkboi.equalsIgnoreCase(question[lq])==true)
                {  
                    aq2=aq1.nextInt();
                }

            }
            question[lp]=checkboi;

        }
        String checkboi1="";
        String continuecheck="";
        Scanner d=new Scanner(System.in);
        for(int l1=0;l1<question.length;l1++)
        {

            System.out.println((l1+1)+"."+question[l1]+"\nType 'n' for the next word");
            do
            {
                continuecheck=d.nextLine();
            }
            while(continuecheck.equalsIgnoreCase("n")==false);
            System.out.print("\f");
        }
        int[] checkboiv2=new int[no];
        int[] aq3=new int[no];
        System.out.println("Any word you want to confirm before the program asks you questions?\nType \"0\" if nothing");
        Scanner sc=new Scanner(System.in);
        int op=0;
        do
        {
            op=sc.nextInt();

            if(op<=question.length)
            {
                if(op!=0)
                {
                    System.out.println("\n"+question[op-1]);
                }
            }
            else
            {
                System.out.println("Out of bounds");
            }
        }
        while(op!=0);
        for(int l4=0;l4<no;l4++)
        {

            aq3[l4]=aq1.nextInt(no);
            for(int lt=0;lt<l4;lt++)
            {
                if(aq3[l4]==aq3[lt])
                {  
                    if(l4!=lt)
                    {
                        aq3[l4]=aq1.nextInt(no);

                    }
                }

            }
        }
        int point=0;
        for(int l3=0;l3<no;l3++)
        {
            String yt="";
            if(aq3[l3]==0)
            {
                yt="st";
            }
            if(aq3[l3]==1)
            {
                yt="nd";
            }
            if(aq3[l3]==2)
            {
                yt="rd";
            }
            if(aq3[l3]>=3)
            {
                yt="th";
            }
            System.out.println("\fWhat was the "+(aq3[l3]+1)+yt+" word?");
            String qw=b.nextLine();
            qw=qw.trim();
            if(question[aq3[l3]].equalsIgnoreCase(qw)==true)
            {
                point++;
                System.out.println("Correct!");
            }
            else
            {
                System.out.println("Incorrect, the correct word was "+question[aq3[l3]]);
            }
        }
        System.out.print("\nYou got "+point+" points\nType anything to go back to the menu");
        String goback=d.nextLine();
        if(goback!="839y427y4dsfs8723y874")
        {
            System.out.print("\f");
            IndexG(pass,uc);
        }
    }
}