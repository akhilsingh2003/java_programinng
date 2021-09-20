class sum_loop {
    public static void main(String[] args) {
        int var1=Integer.parseInt(args[0]);
        int var2=Integer.parseInt(args[1]);
        int var3=Integer.parseInt(args[2]);
        int var4=Integer.parseInt(args[3]);
        int var5=Integer.parseInt(args[4]);
        int size=args.length;
        System.out.println("No. of element in array :"+size);
        for(int i=0;i<size;i++)
        {
            System.out.println(args[i]);
        }
        int result=var1+var2+var3+var4+var5;
        System.out.println("sum = "+result);


    }
}
