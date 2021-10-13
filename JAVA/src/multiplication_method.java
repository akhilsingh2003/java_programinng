import java.util.Scanner;

public class multiplication_method {
    static void table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        table(num);

    }
}
