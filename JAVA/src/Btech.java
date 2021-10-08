import java.lang.*;

class Grandparent {
    void mul(int num1, int num2)
    {
        int add=num1*num2;
        System.out.println(add);
    }
}
class parent extends Grandparent
{
    void sum(int num1, int num2)
    {
        int add =num1+num2;
        System.out.println(add);
    }
}
class child extends parent
{
    void sub(int num1,int num2)
    {
        int add=num1-num2;
        System.out.println(add);
    }
}
class Btech
{
    public static void main(String[] args)
    {
        child c=new child();
        c.sum(7,5);
        c.sub(7,5);
    }
}

