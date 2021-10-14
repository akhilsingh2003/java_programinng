class base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }
}
    class derived extends base
    {
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }


public class inheritance {
    public static void main(String[] args) {
        derived b=new derived();
        b.setX(4);
        System.out.println(b.getX());
    }
}
