class test<T>
{
    T num;
    public void set(T value)
    {
        System.out.println(" T type value has been initialised at this array");
        num=value;
    }

    public T get()
    {
        return (num);
    }
}
public class generic2 {
    public static void main(String[] args) {
        test <Integer> t =new test<Integer>();
        t.set(7);
        test <Character> t1 = new test<Character>();
        t1.set('A');
        System.out.println("values are : "+t.get() +" & "+t1.get());
    }

}

