import java.util.Arrays;
import java.util.Scanner;

public class rem_dup_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

   // Give index of bound
        // for(int i = 0;i<n;i++){
        //     // System.out.print(arr[i]+" ");
        //     if(arr[i] == arr[i+1]){
        //        System.out.print(arr[i-1]);
        //     }
        // }

         for(int i = 0;i<n;i++){
            // System.out.print(arr[i]+" ");
            if(i==0 || arr[i] != arr[i-1])
            System.out.print(arr[i]+" ");
            
        }
        

    }
}
