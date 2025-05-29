import java.util.Arrays;
import java.util.Scanner;
// 29-05-2025
public class second_max_array {
    
    static int secmax(int[]arr){

        Arrays.sort(arr);

        return arr[arr.length-2];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];

        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(secmax(arr));
    }
}
