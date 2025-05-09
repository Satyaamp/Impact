import java.util.Scanner;

public class sum_digits_single_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entr number: ");
        int num = sc.nextInt();

        // while(num >= 10){
        //     int sum = 0;
        //     while(num != 0){
        //         sum += num % 10;
        //         num /= 10;
        //     }
        //     num = sum;
        // }
        int sum = 0;

        while (num!=0) {
            int r = num%10;
            sum+=r;
            num = num/10;

            if(sum>=10 && num == 0){
                num = sum;
                sum = 0;
            }
        }

      
        System.out.println(sum);

      
    }
}
