import java.util.Arrays;
import java.util.Scanner;

public class leetcode_137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n ;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        int i = 0;
        while(i<n-1){
            if(arr[i] == arr[i+2]){
                i+=3;
            }
            else{
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.print(arr[n-1]);
    }
}
