import java.io.*;
class Ifelse 
{
    static void control()
    {
        System.out.println("------------------------IF-ELSE MENU--------------------------------");
        System.out.println("The if-else construct contains two parts containing statements in the if and else, where the statement(s) in"); 
        System.out.println("the if part gets executed if the test expression or condition results to true,otherwise the statement(s) ");
    }

    static void print()
    {
        System.out.println("Press 1 to check whether a number is a BUZZ number or not");
        System.out.println("Press 2 to check whether a word is palindrome or not");
        System.out.println("Press 3 to go back to main menu");
        System.out.println("Press 4 to exit from the program");
    }

    static boolean check()throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int c,n,l,i;
        String w,rw="";
        boolean b=false;
        control();
        do
        {
            b=true;
            print();
            c=Integer.parseInt(x.readLine());
            switch(c)
            {
                case 1:
                System.out.println("Enter a Number");
                n=Integer.parseInt(x.readLine());
                if(n%7==0 || n%10==7)
                    System.out.println(n+" is a BUZZ number");
                else
                    System.out.println(n+" is not a BUZZ number");
                break;
                case 2:
                System.out.println("Enter a word");
                w=x.readLine();
                l=w.length();
                for(i=l-1;i>=0;i--)
                {
                    char ch=w.charAt(i);
                    rw=rw+ch;
                }
                if(w.equalsIgnoreCase(rw))
                    System.out.println("It is a palindrome wordI");
                else
                    System.out.println("It is not a palindrome word");
                break;
                case 3:
                b=false;
                break;
                case 4:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid choice");
            }
        }while(b==true);
        return false;
    }
}
