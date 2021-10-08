/* there is a girl  and some number of boys and they all are go to propose her but ,
she accept only whose proposal whose name length match with her name if the proposal accepted then
print "I love you to boy_name" but in case of not accepted print "beta boy_name tera kat gya "
 */
import java.util.Scanner;


public class love_game {
    public static void main(String[] args)
    {
        System.out.println("Enter the girl name : ");
        Scanner sc = new Scanner(System.in);
        String G_name = sc.next();
        System.out.println("girl name  :"+G_name);
        int gl=G_name.length();
        System.out.println("Enter the number of boys :");
        int n=sc.nextInt();
        String b_name []=new String[10];
        for(int i=0; i<n; i++)
        {
            b_name[i]=sc.next();
        }
        System.out.println(" all boys names are :");
        for(int i=0; i<n; i++)
        {
            System.out.println(b_name[i]);

        }
        System.out.println("\n***Now it's time to check who is accepted ***\n" );
        for (String var:b_name)
        {
            if (var.length()==gl)
            {
                System.out.println("I love you to "+var+"\n");
            }
            else
            {
                System.out.println("Beta "+var+" kat gya tera"+"\n");
            }
        }


    }
}