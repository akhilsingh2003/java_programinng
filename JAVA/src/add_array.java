import java.util.Scanner;

public class add_array {
    public static void main(String[] args) {
        System.out.println("enter the n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the m ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter the arr[" + i + "]" + "[" + j + "]");
                arr[i][j] = sc.nextInt();

            }
        }

        int arr1[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter the arr1[" + i + "]" + "[" + j + "]");
                arr1[i][j] = sc.nextInt();

            }
        }
        System.out.println();
        System.out.println("matrix 1 = ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("matrix 2 = ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(arr1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        int res[][] = new int[n][m];
        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++) {
                res[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        System.out.println();
        System.out.println("result= ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(res[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}