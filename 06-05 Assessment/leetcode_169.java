import java.util.Scanner;

public class leetcode_169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        int count = 1;
        int ans = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == ans){
                count++;
            }
            else if(--count == 0){
                ans = arr[i];
                count =1 ;
            }
        }
        System.out.println(ans);
    }
}
