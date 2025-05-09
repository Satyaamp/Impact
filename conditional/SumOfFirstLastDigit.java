import java.util.*;

public class SumOfFirstLastDigit{ 
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        
        int last_digit = n % 10;

        int first_digit = n; 
        while (first_digit >= 10) {
            first_digit = first_digit / 10;
        }

        System.out.println("The first digit is: " + first_digit);
        System.out.println("The last digit is: " + last_digit);


        System.out.print("SUm: "+ (last_digit + first_digit));
    }

}



