public class even_odd {
    public static void main(String[] args) {
        int ar[]={10,20,34,35,67,8};
        int even_count=0;
        int odd_count=0;
        for (int i = 0; i <ar.length ; i++)
        {
            if (ar[i]%2==0)
            {
                even_count++;
            }
            else
            {
                odd_count++;
            }
        }

        System.out.println("no.of evens : "+even_count );
        System.out.println("no. of odds :"+odd_count);
    }
}
