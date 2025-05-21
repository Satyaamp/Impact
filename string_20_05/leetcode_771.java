import java.util.Scanner;

public class leetcode_771 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter characters for jewels: ");
        String jewels = sc.nextLine();

        System.out.print("Enter characetrs for stones: ");
        String stones = sc.nextLine();


        int count = 0;

        for(int i = 0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i))!=-1){
                count++;
            }
        }

        System.out.println(count);

    }
}
