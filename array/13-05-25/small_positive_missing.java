import java.util.Arrays;
import java.util.Scanner;

public class small_positive_missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
       
        Arrays.sort(arr);

        int num =1;

        for(int i =0;i<n;i++){
            if(arr[i] == num){
                num++;
                
            }
            
        }
        System.out.println(num);


    }
    
}
