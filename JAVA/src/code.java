import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c_i = 0;
        int e_i = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 5; i++) {
                 int a = sc.nextInt();
                if (a == 1) {
                    c_i++;
                } else if (a == 2) {
                    e_i++;
                }

            }
            if (c_i > e_i) {
                System.out.println("INDIA");
            } else if (c_i < e_i) {
                System.out.println("ENGLAND");
            } else {
                System.out.println("DRAW");
            }
        }
    }
}