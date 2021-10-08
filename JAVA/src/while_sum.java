public class while_sum
{
    public static void main(String[] args)
    {
        int size=args.length;
        System.out.println("no. of elements : "+size);
        int sum=0;
        int i=0;
        while (i<size)
        {
            System.out.println(args[i]);
            int d=Integer.parseInt(args[i]);
            sum=sum+d;
            i++;

        }
        System.out.println("total : "+sum);
    }
}



