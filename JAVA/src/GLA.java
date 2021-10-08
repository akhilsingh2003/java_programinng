//polymorphism
public class GLA {
    void Btech()
    {
        System.out.println("Btech from CS");
    }
    void Btech(int account)
    {
        System.out.println("Btech from EC");
    }
    void Btech(int a,int b)
    {
        System.out.println("Btech from Mech");
    }

    public static void main(String[] args) {
        GLA con=new GLA();
        con.Btech(1);
    }
}