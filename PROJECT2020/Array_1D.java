import java.io.*;
class Array_1D
{
    static void control()
    {
        System.out.println("Array is a homologous collection of data,referred by a name and occupying contiguous memory space");
    }

    static void print()
    {   
        System.out.println("Press 1 to check the smallest number in an array of size 5");
        System.out.println("Press 2 to check the longest word in an array of size 5");
        System.out.println("Press 3 to go back to main menu");
        System.out.println("Press 4 to exit from the program");
    }

    static boolean check()throws IOException
    {
        int n[]=new int[5];
        String w[]=new String[5];
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int c,l,i,smallest,llw=0;
        String lw="";
        boolean b=false;
        control();
        do
        {
            System.out.println('\u0000');
            b=true;
            print();
            c=Integer.parseInt(x.readLine());
            switch(c)
            {
                case 1:
                for(i=0;i<5;i++)
                {
                    System.out.println("Enter a number to the array:");
                    n[i]=Integer.parseInt(x.readLine());
                }
                smallest=n[0];
                for(i=0;i<5;i++)
                {
                    if(n[i]<smallest)
                        smallest=n[i];
                }
                System.out.println("The smallest number in the list of the array is "+smallest);
                break;
                case 2:
                for(i=0;i<5;i++)
                {
                    System.out.println("Enter a word to the array");
                    w[i]=x.readLine();
                }
                for(i=0;i<5;i++)
                {
                    l=w[i].length();
                    if(l>llw)
                    {
                        llw=l;
                        lw=w[i];
                    }
                }
                System.out.println("The lomgest word is "+lw);
                break;
                case 3:
                b=false;
                break;
                case 4:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid choice");
                break;
            }
        }while(b==true);
        return false;
    }
}