public class final_keyword {
    final double pi;
    public final_keyword()
    {
        pi=3.14;
    }
    public final_keyword(double pi)
    {
        this.pi=pi;
    }
    public static void main(String[] args) {
        final_keyword f=new final_keyword(22/7);
        System.out.println(f.pi);
    }
}
