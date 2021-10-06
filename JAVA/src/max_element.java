import java.util.Scanner;

public class max_element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the range of array : ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i =0;i<n;i++)
        {
            System.out.println("enter the arr["+i+"]");
            arr[i]= sc.nextInt();
        }
        for(int ele:arr)
        {
            if(ele>max)
            {
                max=ele;
            }
        }
        System.out.println("the maximum the element is : "+max);
    }
}
