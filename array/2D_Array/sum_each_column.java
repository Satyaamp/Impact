import java.util.*;

public class sum_each_column {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
 
        int [][]arr = new int[m][n];
        
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){ 
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int j = 0; j < n; j++) {
            int sum = arr[0][j];
            
            for (int i = 1; i < m; i++) {
                sum+= arr[j][i];
            }
            System.out.println(sum);
        }

        
    }
}
