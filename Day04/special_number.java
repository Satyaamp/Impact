import java.util.Scanner;

public class special_number {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();


        for(int i = m; i<=n; i++){

            // System.out.println(i);
            if(i<=n){
                int last_digit = i%10;
                int first_digit = i/10;
                int sum = first_digit+last_digit;
                int prd = first_digit*last_digit;
                int t_sum = sum+prd;
                if(t_sum == i){
                    System.out.println(i);
                }
            }

        }
    }    
}
