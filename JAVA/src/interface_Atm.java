interface ATM
{
    void cash_withdraw();
    void balance();
}
class atm1 implements ATM
{
    @Override
    public void cash_withdraw() {
        System.out.println("enter the  amount ");
    }

    @Override
    public void balance() {
        System.out.println("current balance  ");
    }
}
public class interface_Atm {
    public static void main(String[] args) {
        atm1 obj = new atm1();
        obj.cash_withdraw();
        obj.balance();
    }
}
