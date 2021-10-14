class base1
{
    base1()
    {
        System.out.println("i am a constructor");
    }
    base1(int a)
    {
        System.out.println("i overloaded constructor with value of a as:"+a);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived1 extends base1
{
    derived1()
    {
        super(0);
        System.out.println("i am a derived class constructor");
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class constuctor_inheritance {
    public static void main(String[] args) {
        //base1 b=new base1();
        derived1 d=new derived1();


    }
}
