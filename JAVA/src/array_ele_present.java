/*Wap  to intialize an integer array with values  and check if a given number is present
  in the array or not if the number not found,it will print -1 else it will print the index
  value of the given in the array.
 */
import java.util.Scanner;

public class array_ele_present {
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the element at arr[" + i + "] :");
            arr[i] = sc.nextInt();
        }
        System.out.println("All element of arr : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nenter the number to check : ");
        int m = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            if (arr[i]==m)
            {
                System.out.println(" yes, the number is present at ar["+i+"]");
                c++;
            }

        }
        if(c==0)
            System.out.println("-1");

    }
}

