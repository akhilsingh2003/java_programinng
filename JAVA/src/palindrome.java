import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int reverse_number = 0;
        int remainder;
        int original_num = num;
        while (num != 0) {
            remainder = num % 10;
            reverse_number = reverse_number * 10 + remainder;
            num /= 10;

        }
        if (original_num == reverse_number) {
            System.out.println("yes it is palindrome");
        } else {
            System.out.println("No it is not a palindrome ");
        }

    }
}