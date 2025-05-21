import java.util.Scanner;
// 21-05-2025

public class first_non_repeating_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a stirng: ");
        String sr= sc.nextLine();

        // Using ASCII values and substrings

        for(int i =0; i<sr.length();i++){
            char ch=sr.charAt(i);
            if(sr.indexOf(ch) == sr.lastIndexOf(ch)){
                System.out.println(ch);
                break;
            }
            
        }

    }
}
