public class example {
    static void func()
    {
        System.out.println("hello world");
    }
    public static void main(String[] args)
    {
        example.func();
        example obj = new example();
        obj.func();
    }
}
