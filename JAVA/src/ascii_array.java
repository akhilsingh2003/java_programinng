/* Wap to initialize an array with ascii values and print the corresponding character values
in single row
 */
import java.util.Scanner;

public class ascii_array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element at arr[" + i + "] :");
            arr[i]=sc.nextInt();

        }
        System.out.println("character are : ");
        for(int i =0;i<n;i++)
        {
            String c =Character.toString(arr[i]);
            System.out.print(c);
        }
    }
}
