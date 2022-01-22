/*
1.You are given a string exp representing expression.
2.Assume that the expression is balanced i.e. the clossing brackets
match each other.
3.But,some of the pair of brackets may be extra/needless.
4.You are required to print true if you detect extra brackets and false otherwise.

E.g.
((a+b)+(c+d))-> false
(a+b)+((c+d))-> true
 */

import java.util.Scanner;
import java.util.Stack;

public class duplicate_brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    System.out.println("True");
                    return;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        System.out.println("False");
    }
}
