import java.util.*;
import java.util.Stack;

public class Stack_exp {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(23);
        st.push(34);
        System.out.println(st);
        System.out.println(st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + " " + st.size());
    }
}
