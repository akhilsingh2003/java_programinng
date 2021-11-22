class first extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("First "+i);
            System.out.println(.getName());
        }
    }
}
public class thread_extend {
}
