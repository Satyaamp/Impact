import java.util.Scanner;

public class divide_two_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int res = dividend/divisor;
        System.out.println(res);
    }
}
