import java.util.Scanner;
// 28-05-2025

public class max_min {

    static int min(int n){

        int min = n;
        while(n>0){
            int ld = n%10;
            if(ld < min)
                min = ld;
                n/=10;
        }
        return min;
    }

    
    static int max(int n){
        int max = 0;
        while(n>0){
            int ld = n%10;
            if(ld > max)
                max = ld;
                n/=10;
        }
        return max;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minDigit = min(n);
        int maxDigit = max(n);

        System.out.println(min(n) + " " + max(n));
        System.out.printf("Difference between max and min = %d", maxDigit - minDigit);

        // System.out.println(max(n));
    }
}
