import java.util.Scanner;

public class number_pattern2
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the n : ");
        int n= sc.nextInt();
        int number=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((number++)+" ");
            }
            System.out.println();
        }
    }
}
