import java.util.*;

public class moves__zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        
       
        for(int i =0;i<n;i++){
             int m  = sc.nextInt();
             while(n!=0){
                int r= m%10;
                if(r ==1){
                    rev = rev*10+r;
                }
                else{
                    count++;
                }
                
                
             }

        }

        


    }
    
}
