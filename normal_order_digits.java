import java.util.Scanner;

public class normal_order_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr number: ");
        int n = sc.nextInt();

        int rev = 0;

        while (n> 0){
            int rem = n %10;
            n /= 10;
            rev = rev * 10 + rem;
        }


        // System.out.println(rev);
        
    }
}
