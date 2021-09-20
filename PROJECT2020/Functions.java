import java.io.*;
class Functions
{ 
    static void control()
    {
        System.out.println("------------------------Functions MENU--------------------------------");
        System.out.println("Functions are the actual block in the class that contains executable statements. It is used to define the behaviour");
        System.out.println("of a class or an object of a class");     
    }

    static void print()
    {
        System.out.println("Press 1 to go back to main menu");
        System.out.println("Press 2 to exit from the program");
    }

    static boolean isPrime(int n)
    {
        int i,f=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                f++;
        }
        if(f==2)
            return true;
        else
            return false;
    }

    static int sumOfPrimeDigits(int n)
    {
        int no=n,s=0,b,f=0,i;
        while(no>0)
        {
            b=no%10;
            for(i=1;i<=b;i++)
            {
                if(b%i==0)
                    f++;
            }
            if(f==2)
                s+=b;
            f=0;
            no=no/10;
        }
        return s;
    }

    static boolean main()throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int c,s,n; 
        boolean check,b=false;
        control();
        do
        {
            b=true;
            System.out.println("Enter a number");
            n=Integer.parseInt(x.readLine());
            check=isPrime(n);
            if(check==true)
                System.out.println(n+" is a prime number");
            else
                System.out.println(n+" is not a prime number");
            s=sumOfPrimeDigits(n);
            System.out.println("Sum of prime digits of "+n+"="+s);
            print();
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
            if(b==true)
                return true;
            else
                return false;
        }while(b==true);
    }
}
