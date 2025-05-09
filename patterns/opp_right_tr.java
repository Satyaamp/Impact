import java.util.Scanner;

public class opp_right_tr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // for(int i = 0;i<=n;i++){
        //     for(int j = 0;j<(n-i);j++){
        //         System.out.print(" "); 
        //     }

        //     for(int k = 0; k<(i+1); k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 0;i<=n;i++){
        //     for(int j = 0;j<i;j++){
        //         System.out.print(" "); 
        //     }

        //     for(int k = 0; k<(n-i); k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        for(int i = 0; i<n ; i++ ){
            for(int j = 0; j<n;j++){
                if(i == 0 || i == (n-1) || j == 0 || j == (n-1)){
                    System.out.print("x ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
