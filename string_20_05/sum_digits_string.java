import java.util.Scanner;
// 23-05-25

public class sum_digits_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sr = sc.nextLine();

        int sum = 0;

        for(int i =0;i<sr.length();i++){
            if(Character.isDigit(sr.charAt(i))){
                sum+=sr.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
