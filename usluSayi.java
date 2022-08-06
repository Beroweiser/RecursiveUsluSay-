
/**
 * usluSayi
 */
import java.util.Scanner;

public class usluSayi {
    static int recursive(int a, int b) {
        
        if (b == 0)
            return 1;
        b--;
        
        return recursive(a,b) *a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Üssü alınacak Sayı : ");
        int a = scan.nextInt();
        System.out.print("Üssü giriniz : ");
        int b = scan.nextInt();

        System.out.println(a + " üzeri " + b + " = " + recursive(a, b));
        scan.close();

    }

}