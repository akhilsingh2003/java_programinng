/* Create an outer class with a function display, again create another
class inside the outer classnamed inner with a function called display
and call the two functions in the main class. */

class Outer{
    String so = ("This is Outer Class");
    void display()
    {
        System.out.println(so);
    }
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    //this is an inner class
    class Inner{
        String si =("This is inner Class");
        void display(){
            System.out.println(si);
        }
    }
}
class InnerClassDemo{
    public static void main(String args[]){
        Outer outer = new Outer();
        outer.display();
        outer.test();
    }

}
