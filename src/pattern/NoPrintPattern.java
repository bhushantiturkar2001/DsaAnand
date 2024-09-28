package pattern;
import java.util.Scanner;

public class NoPrintPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                System.out.print(r);
            }
            System.out.println();
        }

        String s = "hi";
        s = "Hellow";
        System.out.println(s);
    }
}
