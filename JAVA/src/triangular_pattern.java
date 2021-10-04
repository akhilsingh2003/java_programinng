import java.util.Scanner;

public class triangular_pattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height of triangle :" );
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++)
        {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
