import java.util.Scanner;
public class diamond
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n,i,j,k,m;
        System.out.print("enter the number of rows : " );
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
                for(k=n-i;k>0;k--)
                {
                    System.out.print("  ");
                }

            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(m=i-1;m>=1;m--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=1;i<n;i++)
        {
            for(j=1;j<=i;j++)
          {
               System.out.print("  ");
          }
          for(k=n-i;k>0;k--)
            {
                System.out.print("* ");
            }
            for(k=n-i-1;k>0;k--)
            {
                System.out.print("* ");
            }


            System.out.println();

        }
        
        sc.close();
    }

    }