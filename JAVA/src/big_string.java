/*
 Given two strings, a and b, create a bigger string made of the first char of a,
 the first char of b, the second char of a, the second char of b, and so on.
  Any leftover chars go at the end of the result.
If the inputs are "Hello" and "World", then the output is "HWeolrllod".
 */
import java.util.Scanner;
public class big_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.next();
        String b=sc.next();
        String c="";
        int alen,blen,len,i=0;
        alen=a.length();
        blen=b.length();
        len=(alen+blen);
        len=Math.min(alen, blen);
        while(i<len){
            c=c+a.charAt(i)+b.charAt(i);
            i++;
        }
        if(len==alen){
            if(alen!=blen)
                c=c+b.substring(len-1);
        }
        else
            c=c+a.substring(len-1);
        System.out.println("String is: "+c);

    }
}