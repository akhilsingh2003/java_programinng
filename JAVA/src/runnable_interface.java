class first implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("first "+i);
        }
    }
    
}
class second implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j <= 20; j++) {
            System.out.println("Second " + j);
        }
    }
}
public class runnable_interface {
    public static void main(String[] args) {
        Thread t1=new Thread(new first());
        Thread t2=new Thread(new second());
        t1.start();
        t2.start();
    }
}
