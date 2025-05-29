import java.util.Scanner;
// 28-05-2025

public class adam_no {
    //sq of number
    static int square(int n){
        return(n*n);
    }

    // rev of number
    static int reverse(int n){
        int rev = 0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
            // int r = n%10;
            // n/=10;
            // rev = rev*10+r;
        }
        return rev;
    }

    // check --> n_sq == rev_sq_rev_no
    static boolean checknumber(int n ){
        int a = square(n);
        int b = reverse(square(reverse(n)));

        if(a==b)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(checknumber(n));
        if(checknumber(n))
            System.out.println("Adam");
        else
        System.out.println("Not");
    }
}
