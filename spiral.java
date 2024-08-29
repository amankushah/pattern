import java.util.Scanner;
public class spiral
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n,i,j,a,b;
        System.out.print("enter the number of sides : " );
        n=sc.nextInt();
        for(i=1;i<=2*n-1;i++)
        { 
            for(j=1;j<=2*n-1;j++)
            {
                a=i; b=j;

                    if(i>n) a=2*n-i;
                    if(j>n) b=2*n-j;

                       System.out.print(n+1-Math.min(a,b));
                       

             }
        

            System.out.println();
        }
        
        sc.close();
    }

}