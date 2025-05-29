// 24-05-2025

import java.util.Scanner;

public class search_ele_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int target 

        int [][]arr = new int[row][col];

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.println(arr[i][j]+" ");
                arr[i][j] = sc.nextInt();
            }
        }



    }
}
