import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class REGEX {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("nee",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("neetargetNeeString");
        int ctr=0;
        while(m.find())
        {
            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
            ctr++;
        }
        System.out.println(ctr);}}

