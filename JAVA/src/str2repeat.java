/*
 Given a string, return a new string made of n copies of the first 2 chars of the original string
 where n is the length of the string.
 The string may be any length. If there are fewer than 2 chars, use whatever is there.
If the input is “Apple” then the output should be “ApApApApAp”
 */
import java.util.Scanner;
public class str2repeat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ans="";
        System.out.println("Enter the string");
        String input = sc.nextLine();
        int lenght =input.length();
        if(lenght<=1){
            ans=input;

        }
        else{
            for (int i=0;i<lenght;i++){
                ans=ans+input.charAt(0)+input.charAt(1);
            }
        }
        System.out.print(ans);
        sc.close();

    }

}
