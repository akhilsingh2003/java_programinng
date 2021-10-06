import java.util.Scanner;
public class array3D {
    public static void main(String[] args) {
        System.out.println("enter the n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the m ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <m; j++)
            {
                System.out.println("enter the arr[" + i + "]" + "[" + j + "]");
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}