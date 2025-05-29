
//Leetcode 242 --> anagram

import java.util.Arrays;
import java.util.Scanner;

public class leetcode_242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String s = "anagram";
        // String t = "nagaram";
        
        String s = sc.nextLine();
        String t = sc.nextLine();

        char sSort[] = s.toCharArray();
        Arrays.sort(sSort);
        
        char tSort[] = t.toCharArray();
        Arrays.sort(tSort);

        System.out.println(sSort);
        System.out.println(tSort);


        if(Arrays.equals(sSort,tSort)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
