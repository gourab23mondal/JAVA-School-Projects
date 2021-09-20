import java.io.*;
class Constructor 
{
    static void control()
    {
        System.out.println("Constructor are methods that are invoked to create objects from the class blueprint.");
        System.out.println("It has the same name as the class name and is generally used for intialization of variables");
    }
    static int l,b,h;
    static String s;
    Constructor(int length,int breadth,int height)
    {
        l=length;
        b=breadth;
        h=height;
    }

    Constructor(String s)
    { 
        this.s=s;
    }

    static void volume()
    {
        double volume;
        volume=l*b*h;
        System.out.println("Volume="+volume);
    }

    static  void word()
    {
        int l,i,c=0;
        char ch;
        s=s+" ";
        String w="";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
                w+=ch;
            else
            {
                c++;
                w="";
            }
        }
        System.out.println("Number of words="+c);
    }

    static boolean check()throws IOException
    { 
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int length,breadth,height,c;
        String st;
        boolean b=false;
        control();
        do
        {
            b=true;
            System.out.println("Enter the length breadth and height");
            length=Integer.parseInt(x.readLine());
            breadth=Integer.parseInt(x.readLine());
            height=Integer.parseInt(x.readLine());
            System.out.println("Enter a sentence");
            st=x.readLine();
            Constructor ob1=new Constructor(length,breadth,height);
            Constructor ob2=new Constructor(st);
            ob1.volume();
            ob2.word();
            System.out.println("Press 1 to go back to main menu");
            System.out.println("Press 2 to exit from the program");
            c=Integer.parseInt(x.readLine());
            switch(c)
            {
                case 1:
                b=false;
                break;
                case 2:
                System.exit(0);
                break;
            }
        }while(b==true);
        return false;
    }
}
 