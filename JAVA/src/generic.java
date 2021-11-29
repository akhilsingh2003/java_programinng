public class generic {
    public <T> void disp( T arr[])
    {
        System.out.println("this array has following elements : ");
        for (T ele:arr)
        {
            System.out.println(ele);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Integer num[]=new Integer[]{23,45,67,88,55};
        String names[]=new String[]{"tani","kanchi","anamika"};
        generic g=new generic();
        g.disp(num);
        g.disp(names);
    }
}
