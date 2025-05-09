import java.util.Scanner;

public class even_odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int odd_sum = 0;
        int even_sum = 0;
        int count = 0;

        while(number!=0){
            
            int last_digit = number%10;
            if (last_digit%2==0) {
                even_sum+= last_digit;
            }else{
                odd_sum+= last_digit;
            }
            number=number/10;
            count++;
        }
        System.out.println(odd_sum);
        System.out.println(even_sum);
        System.out.println(count);
    
    }
}
