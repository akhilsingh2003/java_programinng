public class sum_array {
    public static void main(String[] args)
    {
        int ar[]={11,22,33,44,55,};
        int sum=0;
        System.out.println("______array element____");
        for (int i = 0; i < ar.length; i++)
        {
            sum=sum+ar[i];
        }
        System.out.println("sum of elements : "+sum);
    }
}
