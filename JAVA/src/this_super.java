class one_cls
{
    int a;
    public int getA() {
        return a;
    }
    one_cls(int a)
    {
        this.a=a;
    }
        public int retrunone()
    {
        return 1;
    }
}
class two_cls extends one_cls
{
    two_cls(int c)
    {
        super(c);
        System.out.println(" i am a constructor");
    }
}
public class this_super {
    public static void main(String[] args) {
        one_cls o=new one_cls(56);
        two_cls t= new two_cls(5);
        System.out.println(o.getA());
    }
}
