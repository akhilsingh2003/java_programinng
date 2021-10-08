public class highest_array {
    public static void main(String[] args) {
        int ar[]={12,3,4,55,6,677,5};
        int max =ar[0];
        for (int var:ar)
        {
            if (var>max);
            {
                max = var;
            }
        }
        System.out.println("higest number is :" +max);
    }
}
