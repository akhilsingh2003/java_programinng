
public class method_overloading {
    static void foo()
    {
        System.out.println("tani");
    }
     static void foo(int a)
    {
        System.out.println("moti");
    }

    static void foo(int...arr)
    {
        System.out.println("hahah");


    }
    public static void main(String[] args) {
        foo(6,7,8,9);
        foo(1);
        foo();

    }
}
