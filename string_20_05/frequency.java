import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string");
        String sr = sc.nextLine();
        System.out.print("Enter character to count: ");
        char ch = sc.next().charAt(0);

        int count=0;

        for(int i =0;i<sr.length();i++){
            if (sr.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);




    }
}
