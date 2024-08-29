import java.util.Scanner;
public class nextriangle
 {
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
        int m, n,i,j,k,a=1;
        System.out.print("enter the number of rows and columns : " );
        n=sc.nextInt();
          for(i=1;i<=n;i++)
        {
            if(i==n/2)
            {
                for(k=1;k<=n;k++) 
                System.out.print("*");
            }
            else{
            for(j=1;j<=n;j++)
            {
                if(j==n/2)
                {
                 System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        

        

            System.out.println(" ");
        }
     
        
        sc.close();

    }
}
