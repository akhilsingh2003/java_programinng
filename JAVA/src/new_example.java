class new_example
{
    static void func()
    {
        System.out.println("function working");
    }
    public static void main(String[] args)
    {
        new_example.func();
        new_example obj = new new_example();
        obj.func();
    }
}
