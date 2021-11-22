abstract class Base12
{

    abstract public void greet();
    abstract public void greet2();

}
class child2 extends Base12
{
    public void greet()
    {
        System.out.println("Goood morning");
    }
    public void greet2()
    {
        System.out.println("good afternoon");

    }
}
abstract class chlid3 extends Base12
{
    public void th()
    {
        System.out.println(" I am good");
    }
}
public class abstract_cls {
    public static void main(String[] args) {

        child2 c=new child2();
        c.greet();
        c.greet2();

    }
}
