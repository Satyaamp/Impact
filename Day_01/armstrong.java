import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        int digit_c = 0;
        int sum = 0;
        int temp = num;
        int temp1 = num;

        while (num != 0){
            digit_c+=1;
            num /=10;
        }

        while(temp!=0){
            int r = temp%10;
            sum += Math.pow(r,digit_c);
            temp/=10;
        }

        if(sum == temp1){
            System.out.println("ARMSTRONG NUMBER");
        }else{
            System.out.println("NOT");
        }

        System.out.println(digit_c);
        System.out.println(sum);


  
        
    
    }
}
