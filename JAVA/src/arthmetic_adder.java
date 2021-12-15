/*Write the following code:
A class named Arithmetic with a method named add that takes  integers as parameters and
returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.
*/

class Arithmetic{
}

class Adder extends Arithmetic {
    public int add(int a, int b){
        return a+b;
    }
}

public class arthmetic_adder {
    public static void main(String []args){
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}