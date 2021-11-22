class fruit
{
     void eat(String name,String taste)
    {
        System.out.println("testing the fruit");
    }
}
class apple extends fruit
{
    void eat(String name, String taste) {
        super.eat(name, taste);
        System.out.println("testing apple");
    }
}
class orange extends fruit
{
    void eat(String name, String taste) {
        super.eat(name, taste);
        System.out.println("testing orange");
    }
}
public class abcd {
    public static void main(String[] args) {
        apple a=new apple();
        orange o=new orange();
        a.eat("apple","sour");
        o.eat("orange","salty");


    }
}
