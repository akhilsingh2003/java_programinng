public class highest
{
    public static void main (String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        System.out.println("a=  "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        if (a>b && a>c)
            System.out.println(" a is largest which is "+a);
        else if(b>a && b>c)
            System.out.println("b is largest which is "+b);
        else
            System.out.println("c is largest which is "+c);



    }
}
