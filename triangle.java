import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,i,j,k;
        System.out.print("enter the number of rows : " );
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                for(k=65;k<(65+i);k++)
                {
                    System.out.print((char)k+" ");
                }

            }
            else
            {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            }

            System.out.println(" ");
        }
        
        sc.close();

    }

    }