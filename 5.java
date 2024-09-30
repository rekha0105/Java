
import java.util.*;
class fbpr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c=0,n,k=0;
        System.out.println("Enter Range");
        n= sc.nextInt();
        System.out.println("Fibonacci Series given below:-");
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            if(c>n)
            {
                break;
            }
            else
            {
                for(int j=1;j<=c;j++)
                {
                    if(c%j==0)
                    {
                        k++;
                    }
                }
                if(k==2)
                {
                    System.out.print(c+"\t");
                }
                a=b;
                b=c;
                k=0;
            }
        }
    }
}