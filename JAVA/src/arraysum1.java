/*
Write a program to print the sum of the elements of an array following the given below
condition.
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the
other numbers for calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22
[i.e 10+3+9]

 */
import java.util.Scanner;
public class arraysum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("enter the element at arr[" + i + "] :");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                for (int j = n - 1; j >= 0; j--) {
                    if (arr[j] == 7)
                        break;
                    d = d + arr[j];
                }
                break;
            }
            sum = sum + arr[i];

        }
        System.out.println("Sum= " + (sum+d));
    }
}

