import java.util.StringTokenizer;

public class String_tokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("I am String_tokenizer");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
