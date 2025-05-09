import java.util.Scanner;

public class adam_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Find sq. of no
        int n_sq = n * n;
        System.out.println(n_sq);

        // Find rev of n
        int rev_n = 0;
        
        while (n>0){
            int r = n%10;
            n/=10;
            rev_n = rev_n * 10 + r;
        }
        System.out.println(rev_n);

        // Find sq of rev no
        int sq_rev_n = rev_n*rev_n;

        int sq_sq_rev_no = 0;

        while(sq_rev_n>0){
            int rem = sq_rev_n%10;
            sq_rev_n/=10;
            sq_sq_rev_no = sq_sq_rev_no * 10 + rem;
        }

        // Check conditon

        if(n_sq == sq_sq_rev_no){
            System.out.println("ADAM NUMBER");
        }else{
            System.out.println("NOT ADAM");
        }
    }
}
