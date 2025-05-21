import java.util.Scanner;
//Leetcode 1108 --> 21-05-25

public class leetcode_1108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an IP Address: ");
        String sr = sc.nextLine();

        String res = sr.replace(".", "[.]");

        System.out.println(res);
    }
}
