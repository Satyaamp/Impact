import java.util.Scanner;
// 22-05-25

public class leetcode_796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "abcde";
        String goal = "cdeab";
        String goal1 = "abced";
        if(s.length()!=goal1.length()){
            System.out.println("false");
        }

        String sr = s+s;
        // System.out.println(sr);
         
        if(sr.contains(goal1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
