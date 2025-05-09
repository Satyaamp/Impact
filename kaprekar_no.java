import java.util.Scanner;

public class kaprekar_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        
        int count = 0;
        int temp = k;

        int sq_k = k*k;

        // System.out.println(sq_k);

    
        while(temp!=0){
            count+=1;
            temp/=10;
        }


        int div = (int) Math.pow(10, count);
        
        int first = sq_k%div;
        int second = sq_k/div;

        if(first + second == k){
            System.out.println("Kaprekar Number");
        }else{
            System.out.println("Not Kaprekar Number");
        }






    }
}
