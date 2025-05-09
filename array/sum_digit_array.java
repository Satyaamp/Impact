import java.util.Scanner;

public class sum_digit_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int sub = arr[0];
        for(int i = 0; i<n;i++){
            sum+= arr[i];
            if(i>0){
                sub -= arr[i];
            }

        }

        System.out.println(sum);
        System.out.println(sub);


    }
}
