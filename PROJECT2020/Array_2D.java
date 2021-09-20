import java.io.*;
class Array_2D
{
    static void control()
    {
        System.out.println("Array is a homologous collection of data,referred by a name and occupying contiguous memory space");
    }

    static void print()
    {   
        System.out.println("Press 1 to check the palindrome numbers in an array of size 5*2");
        System.out.println("Press 2 to print the longest word in an array of size 5*2");
        System.out.println("Press 3 to go back to main menu");
        System.out.println("Press 4 to exit from the program");
    }

    static boolean check()throws IOException
    {
        int n[][]=new int[5][2];
        String w[][]=new String[5][2];
        int p[]=new int[10]; 
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int ch,l,i,j,c=0,no,s=0,llw=0;
        String lw="";
        boolean b=false;
        control();
        do
        {
            System.out.println('\u0000');
            b=true;
            print();
            ch=Integer.parseInt(x.readLine());
            switch(ch)
            {
                case 1:
                for(i=0;i<5;i++)
                {
                    for(j=0;j<2;i++)
                    {
                        System.out.println("Enter a number to the array:");

                    }
                }

                for(i=0;i<5;i++)
                {
                    for(j=0;j<2;j++)
                    {
                        no=n[i][j];
                        while(no>0)
                        {
                            s+=(no%10);
                            no=no/10;
                        }
                        if(s==n[i][j])
                        {
                            c++;
                            p[c-1]=n[i][j];
                        }
                    }
                }
                if(c!=0)
                {
                    System.out.println("The palindrome numbers is/are:");
                    for(i=0;i<c;i++)
                        System.out.print(p[i]+" ");
                    System.out.println();
                }
                else
                    System.out.println("There are no palindrome numbers");           
                break;
                case 2:

                for(i=0;i<5;i++)
                {
                    for(j=0;j<2;j++)
                    {
                        System.out.println("Enter a word to the array");
                        w[i][j]=x.readLine();
                    }
                }

                for(i=0;i<5;i++)
                {
                    for(j=0;j<2;j++)
                    {
                        l=w[i][j].length();
                        if(l>llw)
                        {
                            llw=l;
                            lw=w[i][j];
                        }
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