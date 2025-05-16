import java.util.Scanner;

public class binary_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rev = 0;
        int base = 1;

        while(n>0){
            int ld =n%10;
            rev= rev+ld*base;
            base*=2;
            n/=10;
        }
        System.out.print(rev);
    }
}
