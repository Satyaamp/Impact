import java.util.*;

public class odd_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int odd_count = 0;

        for (int i = 1; i <= number; i++) {
            int temp = i;
            int count = 0;

            while (temp != 0) {
                temp = temp / 10;
                count++;
            }

            if (count % 2 == 1) {
                odd_count++;
            }
        }

        System.out.println(odd_count);
    }
}
