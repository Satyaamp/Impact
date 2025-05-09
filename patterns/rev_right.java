import java.util.Scanner;

public class rev_right {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // for(int i = 1; i<=n;i++){
        //     for(int j = n; j>=i; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        for(int i = 0;i<=n;i++){
            for(int j = 0; j<(n-i);j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}