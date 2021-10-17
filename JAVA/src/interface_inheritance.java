interface interface1
{
    void meth1();
    void meth2();

}
interface childinterface extends interface1
{
    void meth3();
    void meth4();
}
class sampleClass implements childinterface
{
    public void meth1()
    {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println("meth2");
    }
    public void meth3()
    {
        System.out.println("meth3");
    }
    public void meth4()
    {
        System.out.println("meth4");
    }
}
public class interface_inheritance {
    public static void main(String[] args) {
        sampleClass ob = new sampleClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}