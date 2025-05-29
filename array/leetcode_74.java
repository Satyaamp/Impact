import java.util.Scanner;
// Leetcode_74 --> 24-05-25

public class leetcode_74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();


        int [][]arr = new int[row][col];

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        int m = arr.length;
        int n = arr[0].length;

        int l = 0;
        int r = m*n;


        while(l<r){
            int mid = (l+r)/2;
            int i = mid/n; //row
            int j = mid%n; //col

            if(arr[i][j] == target){
                System.out.printf("Found at arr[%d][%d]\n", i,j);
            }

            if(arr[i][j]<target){
                l = mid+1;
            }else{
                r = mid;
            }
        }

        

    }
}
