import java.io.*;
class Main
{ 
    static int options() throws IOException
    {
        int c;
        System.out.println('\f');
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Your options are-");
        System.out.println("1.INTRODUCTION");
        System.out.println("2.IF-ELSE");
        System.out.println("3.FUNCTIONS");
        System.out.println("4.CONSTRUCTOR");
        System.out.println("5.1D ARRAY");
        System.out.println("6.2D ARRAY");
        System.out.println("7.ACKNOWLEDGEMENT");
        System.out.println("8.EXIT FROM THE PROGRAM");
        System.out.println("Select any one---");
        c=Integer.parseInt(x.readLine());
        return c;
    }

    public static void main (String args[]) throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        boolean b=false;
        int sc,c;
        c=options();
        while(true)
        {
            System.out.println('\f');
            switch(c)
            {
                case 1:
                System.out.println("Members of our group comprises of");
                System.out.println("Avik Roy");
                System.out.println("Ayan Das");
                System.out.println("Debodit Ray");
                System.out.println("Gourab Mondal");
                System.out.println("Ootso Dhar");
                System.out.println("Sreejan Sarkar");
                System.out.println("Samanay Basu");
                System.out.println("Press 1 to go back to main menu or 2 to exit from program");
                sc=Integer.parseInt(x.readLine());
                switch(sc)
                {
                    case 1:
                    c=options();
                    break;
                    case 2:
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Invalid choice");
                }
                break;
                case 2:
                b=Ifelse.check();
                if(b==false)
                    c=options();
                break;
                case 3:
                Functions fob=new Functions();
                b=fob.main();
                if(b==false)
                    c=options();
                break;
                case 4:
                b=Constructor.check();
                if(b==false)
                    c=options();
                break;
                case 5:
                b=Array_1D.check();
                if(b==false)
                    c=options();
                break;
                case 6:
                b=Array_2D.check();
                if(b==false)
                    c=options();
                break;
                case 7:
                System.out.println("All the members of our are greatly thankful to our Computer teacher,Ashish Sir and this");
                System.out.println("helped a lot in improvising our knowledge about the programming language, Java. Rightly said by");
                System.out.println("someone failure teaches us more and the same proverb applies here too..");
                System.out.println("Press 1 to go back to main menu menu or 2 to exit from the program");
                sc=Integer.parseInt(x.readLine());
                switch(sc)
                {
                    case 1:
                    c=options();
                    break;
                    case 2:
                    System.exit(0);
                    break;
                    default:
                    c=options();
                }
                break;
                default:
                System.out.println("Invalid choice");
                c=options();
                break;
                case 8:
                System.exit(0);
                break;
            }
        }
    }
}