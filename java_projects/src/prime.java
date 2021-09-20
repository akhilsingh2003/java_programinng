public class prime
{
    public static void main(String[] args)
    {
        int ar[]={2,31,45,67,11,7};
        int not_prime_count=0;
        int prime_count=0;
        System.out.println("elements are : ");
        for (int i = 0; i <ar.length ; i++)
        {
            System.out.println(ar[i]);
            int flag=0;
            for (int j = 2; j <i ; j++)
            {
                if(i%j==0)
                {
                    flag=1;
                }

            }
            if(flag==0)
            {
                prime_count++;
            }
            else
            {
                not_prime_count++;
            }

        }
        System.out.println("no.of prime number:"+prime_count);
        System.out.println("no.of not prime: "+not_prime_count);
    }
}
