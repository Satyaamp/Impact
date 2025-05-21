import java.util.Scanner;

public class smallest_missing_char_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String sr = sc.nextLine();

        // for(char ch ='a';ch<='z';ch++){
        //     System.out.print(ch+"");
        // }

        String alpha ="abcdefghijklmnopqrstuvwxyz";
    
        for(int i =0;i<alpha.length();i++){
            char ch = alpha.charAt(i);
            if(sr.toLowerCase().indexOf(ch)==-1){
                System.out.println(ch);
                return;
            }
        }



    }

}
