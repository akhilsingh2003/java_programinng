/*
Write a program that will check whether a given String is Palindrome or not
 */
import java.util.Scanner;

public class palindrome_str
{
    public static void main(String args[])
    {
        String str, rev_str = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = sc.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev_str = rev_str + str.charAt(i);

        if (str.equalsIgnoreCase(rev_str))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");

    }
}