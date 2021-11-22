interface Bicycle
{
    int a=54;
    void applyBrake(int decrement);
    void speedUp(int increment);
    void blowHorn();
}

class AvonCycle implements Bicycle{
    public void blowHorn()

    {
        System.out.println("pee pee pee ");
    }
    public void applyBrake(int decrement)
    {
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment) 
    {
        System.out.println("Applying speedUp");
    }
}
public class interfaces {
    public static void main(String[] args) {
        AvonCycle cycle=new AvonCycle();
        cycle.applyBrake(1);
        cycle.blowHorn();
        System.out.println(cycle.a);
    }
}
