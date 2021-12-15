/*Create two threads, one thread to display all even numbers between 1 and 20,
 another to display odd numbers between 1 and 20.
Note: Display all even numbers followed by odd numbers.
*/

public class even_odd_thread {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<11;i++){
            if(i%2 == 1)
                System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=0;i<11;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}