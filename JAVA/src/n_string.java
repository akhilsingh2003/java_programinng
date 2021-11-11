/*
Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
 You may assume that n is between 0 and the length of the string, inclusive.
  For example, if the inputs are “Niraj” and 3, then the output should be “rajrajraj.
 */
import java.util.Scanner;

public class n_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n= sc.nextInt();
        int len = str.length();
        String newWord = "";
        for (int i = 0; i < n; i++)
        {
            newWord += str.substring(len - n, len);
        }
        System.out.println(newWord);

    }
}
