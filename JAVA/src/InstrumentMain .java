abstract class Instrument
{
    public abstract void Play();
}
    class Piano extends Instrument
    {
        public void Play()
        {
            System.out.println("Piano is playing tan tan tan tan");
        }
    }

    class Flute extends Instrument
    {
        public void Play()
        {
            System.out.println("Flute is playing toot toot toot toot ");
        }
    }

    class Guitar extends Instrument
    {
        public void Play()
        {
            System.out.println("Guitar is playing tin tin tin");
        }
    }

    class InstrumentMain {

        public static void main(String args[]) {
            Instrument A[] = new Instrument[10];
            for (int i = 0; i< 10; i++) {
                switch (i % 3)
                {
                    case 0: {
                        A[i] = new Piano();
                        break;
                    }
                    case 1: {
                        A[i] = new Flute();
                        break;
                    }
                    case 2: {
                        A[i] = new Guitar();
                        break;
                    }
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1));
                A[i].Play();
                if (A[i] instanceof Piano) {
                    System.out.println("Piano");
                }
                if (A[i] instanceof Flute) {
                    System.out.println("Flute");
                }
                if (A[i] instanceof Guitar) {
                    System.out.println("Guitar");
                }
            }
        }
    }

