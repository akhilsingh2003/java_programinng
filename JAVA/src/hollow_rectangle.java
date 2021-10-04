import java.util.Scanner;

public class hollow_rectangle
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of rectangle : ");
        int l=sc.nextInt();
        System.out.println("enter the breadth of rectangle: ");
        int b= sc.nextInt();
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=b;j++)
            {
                if (i==1 || j==1 || i==l || j==b)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
