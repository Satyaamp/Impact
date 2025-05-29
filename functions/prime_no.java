import java.util.Scanner;
// 27-05-2025

public class prime_no {
    public static boolean prime(int a ){
        if(a<2){
            return false;
        }

        for(int i =2;i<= Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        System.out.println(prime(n));
        
    }
}
