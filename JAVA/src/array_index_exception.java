import java.util.Scanner;
public class array_index_exception {
    public static void main(String[] args) {
        String arr[]={"akhil","amit","gautam,","lalit"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the required element ::");
        try {
            int element = sc.nextInt();
            System.out.println("Element in the given index is :: "+arr[element]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you have entered is invalid");
            System.out.println("Please enter an  valid index number");
        }
    }
}