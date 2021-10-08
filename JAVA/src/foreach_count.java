public class foreach_count
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50,60,};
        int count=0;
        int sum=0;
        for (int var:a)
        {
            System.out.println(var);
            count++;
            sum+=var;
        }
        System.out.println("No of elements :" +count);
        System.out.println("Sum of elements :" +sum);
    }

}
