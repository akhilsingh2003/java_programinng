import java.util .Scanner;

public class cls_percent {
    public static void main(String[] args) {
        int total=500;
        float obt;
        System.out.println("Enter the marks of subjects :");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks of sub-1 :");
        float sub_1=sc.nextInt();
        System.out.println("enter the marks of sub_2:");
        float sub_2=sc.nextInt();
        System.out.println("enter the marks of sub_3:");
        float sub_3=sc.nextInt();
        System.out.println("enter the marks of sub_4:");
        float sub_4=sc.nextInt();
        System.out.println("enter the marks of sub_5:");
        float sub_5=sc.nextInt();
        obt=sub_1+sub_2+sub_3+sub_4+sub_5;
        float percent=(obt*100)/total;
        System.out.println("marks obtained = "+obt+"/"+total);
        System.out.println("total percent : "+percent);
    }
}
